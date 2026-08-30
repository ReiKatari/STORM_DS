package kj;

import java.lang.reflect.Array;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean[] f8317a = new boolean[256];

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f8318b = new byte[256];

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f8319c = new byte[18002];

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f8320d = new byte[18002];

    /* renamed from: e  reason: collision with root package name */
    public final int[] f8321e = new int[256];

    /* renamed from: f  reason: collision with root package name */
    public final int[][] f8322f;

    /* renamed from: g  reason: collision with root package name */
    public final int[][] f8323g;

    /* renamed from: h  reason: collision with root package name */
    public final int[][] f8324h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f8325i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f8326j;

    /* renamed from: k  reason: collision with root package name */
    public final char[] f8327k;

    /* renamed from: l  reason: collision with root package name */
    public final char[][] f8328l;
    public final byte[] m;

    /* renamed from: n  reason: collision with root package name */
    public int[] f8329n;

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f8330o;

    public a(int i2) {
        Class cls = Integer.TYPE;
        this.f8322f = (int[][]) Array.newInstance(cls, 6, 258);
        this.f8323g = (int[][]) Array.newInstance(cls, 6, 258);
        this.f8324h = (int[][]) Array.newInstance(cls, 6, 258);
        this.f8325i = new int[6];
        this.f8326j = new int[257];
        this.f8327k = new char[256];
        this.f8328l = (char[][]) Array.newInstance(Character.TYPE, 6, 258);
        this.m = new byte[6];
        this.f8330o = new byte[i2 * 100000];
    }
}
