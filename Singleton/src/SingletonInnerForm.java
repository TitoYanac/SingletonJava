class SingletonInnerForm {

    private static class SingletonHolder {
        public static SingletonInnerForm instance = new SingletonInnerForm();
    }

    private SingletonInnerForm() {
    }

    public static SingletonInnerForm getInstance() {
        return SingletonHolder.instance;
    }
}
