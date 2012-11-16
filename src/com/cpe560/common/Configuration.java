package com.cpe560.common;

public class Configuration {
    public Configuration() {};
    private int iterations;
    private int readsPerSecond;
    private int writesPerSecond;
    private String outputFilename;

    public int getIterations() { return iterations; }
    public int getReadsPerSecond() { return readsPerSecond; }
    public int getWritesPerSecond() { return writesPerSecond; }
    public String getOutputFilename() { return outputFilename; }

    public void setIterations(int iterations) { this.iterations = iterations; }
    public void setReadsPerSecond(int readsPerSecond) { this.readsPerSecond = readsPerSecond; }
    public void setWritesPerSecond(int writesPerSecond) { this.writesPerSecond = writesPerSecond; }
    public void setOutputFilename(String filename) { this.outputFilename = filename; }
}