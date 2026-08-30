package defpackage;

import java.lang.reflect.Array;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iy  reason: default package */
/* loaded from: classes.dex */
public final class iy {
    public final boolean[] a = new boolean[256];
    public final byte[] b = new byte[256];
    public final byte[] c = new byte[18002];
    public final byte[] d = new byte[18002];
    public final int[] e = new int[256];
    public final int[][] f;
    public final int[][] g;
    public final int[][] h;
    public final int[] i;
    public final int[] j;
    public final char[] k;
    public final char[][] l;
    public final byte[] m;
    public int[] n;
    public final byte[] o;

    public iy(int i) {
        Class cls = Integer.TYPE;
        this.f = (int[][]) Array.newInstance(cls, 6, 258);
        this.g = (int[][]) Array.newInstance(cls, 6, 258);
        this.h = (int[][]) Array.newInstance(cls, 6, 258);
        this.i = new int[6];
        this.j = new int[257];
        this.k = new char[256];
        this.l = (char[][]) Array.newInstance(Character.TYPE, 6, 258);
        this.m = new byte[6];
        this.o = new byte[i * 100000];
    }
}
