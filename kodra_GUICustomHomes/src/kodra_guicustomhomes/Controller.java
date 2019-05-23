package kodra_guicustomhomes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author besian kodra
 */
public class Controller {

    View of = new View();
    Order custOrder = new Order();
    Receipt rw = new Receipt();

    double potentialBill;

    public void createCustomOrderForm() {

        of.addOrderListener(new OrderListener());
        of.setUp();
        of.show(true);
    }

    private boolean determineCustomerInfo() {

        if (of.getTxtName().getText().trim().length() > 0
                && of.getTxtAddress().getText().trim().length() > 0
                && of.getTxtPhoneNumber().getText().trim().length() > 0) {

            custOrder.setName(of.getTxtName().getText().trim());

            custOrder.setAddress(of.getTxtAddress().getText().trim());

            custOrder.setPhone(of.getTxtPhoneNumber().getText().trim());
            return true;
        } else {
            return false;
        }
    }

    private boolean determineBuildOption() {

        if (of.getRdbtnExisitingLot().isSelected()) {
            custOrder.setPlot("on an existing Lot");
            return true;
        } else if (of.getRdbtnNewSub().isSelected()) {
            custOrder.setPlot("in a new sub division");
            potentialBill += 30000;
            return true;
        } else {
            return false;
        }
    }

    private boolean determineModelOption() {

        double luxCost = 400000;
        double custCost = 300000;
        double standCost = 200000;

        if (of.getRdbtnLuxury().isSelected()) {
            custOrder.setSize("Luxury Model Home");
            potentialBill += luxCost;
            return true;
        } else if (of.getRdbtnCustom().isSelected()) {
            custOrder.setSize("Custom Model Home");
            potentialBill += custCost;
            return true;
        } else if (of.getRdbtnStandard().isSelected()) {
            custOrder.setSize("Standard Model Home");
            potentialBill += standCost;
            return true;
        } else {
            return false;
        }
    }

    private void determineAddOns() {

        int addOnCount = 0;
        double addOnCost = 50000;

        if (of.getChkboxGraniteCounter().isSelected()) {
            custOrder.setAddons(of.getChkboxGraniteCounter().getText() + ", ");
            addOnCount++;
        }

        if (of.getChkboxJacuzzi().isSelected()) {
            custOrder.setAddons(of.getChkboxJacuzzi().getText() + ", ");
            addOnCount++;
        }

        if (of.getChkboxFinishedBasement().isSelected()) {
            custOrder.setAddons(of.getChkboxFinishedBasement().getText() + ", ");
            addOnCount++;
        }

        if (of.getChkboxSmartHome().isSelected()) {
            custOrder.setAddons(of.getChkboxSmartHome().getText() + ", ");
            addOnCount++;
        }

        if (of.getChkboxCustLandscape().isSelected()) {
            custOrder.setAddons(of.getChkboxCustLandscape().getText() + ", ");
            addOnCount++;
        }

        if (of.getChkboxBrickPatio().isSelected()) {
            custOrder.setAddons(of.getChkboxBrickPatio().getText() + " ");
            addOnCount++;
        }

        if (addOnCount > 0) {
            double addOnTotal = (addOnCount * addOnCost) - addOnCost;
            potentialBill += addOnTotal;
        }

    }

    class OrderListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            boolean validCustInfo = false;
            boolean validBuildOption = false;
            boolean validModelOption = false;
            String msg;
            potentialBill = 0;

            validCustInfo = determineCustomerInfo();

            if (validCustInfo) {
                validBuildOption = determineBuildOption();
            } else {
                msg = "Valid customer info must be entered!";
                of.displayErrorMessage(msg);
                return;
            }
            if (validBuildOption) {
                validModelOption = determineModelOption();
            } else {
                msg = "A build option must be selected!";
                of.displayErrorMessage(msg);
            }
            if (validModelOption) {

                determineAddOns();
            } else {
                msg = "A model type must be selected!";
                of.displayErrorMessage(msg);
                return;
            }

            if (validCustInfo && validBuildOption && validModelOption) {

                custOrder.setOrderTotal(potentialBill);

                rw.createReceipt(custOrder);

                of.displayConfirmationMessage(custOrder);
            } else {
                msg = "This got reall messed up. Please contact IT support for more help.";
                of.displayErrorMessage(msg);
                return;
            }

        }

    }
}