package me.bechberger.meta;

/** Diff class that mirrrs the runtime.BytecodeDiff class to prevent conversion issues */
public record BytecodeDiff(byte[] old, byte[] current) {}
