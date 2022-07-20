package com.gabriellourenco12;

import software.amazon.awscdk.App;

public class AwsCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        VpcStack VpcStack = new VpcStack(app, "Vpc");

        ClusterStack clusterStack = new ClusterStack(app, "Cluster", VpcStack.getVpc());
        clusterStack.addDependency(VpcStack);

        app.synth();
    }
}

