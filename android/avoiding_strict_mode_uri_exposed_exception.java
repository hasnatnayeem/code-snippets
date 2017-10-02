//Place these lines in onCreate method of any activity

StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
StrictMode.setVmPolicy(builder.build()); //ignore URI Exposer exception
