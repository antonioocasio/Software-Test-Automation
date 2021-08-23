class ContactTest{
    public static void main(String[] args){
        ContactServiceTest cst = new ContactServiceTest();

        cst.testAddPass();
        System.out.println("");

        cst.testAddFail();
        System.out.println("");

        cst.testDeletePass();
        System.out.println("");

        cst.testDeleteFail();
        System.out.println("");

        cst.testUpdatePass();
        System.out.println("");

        cst.testUpdateFail();
    }
}
