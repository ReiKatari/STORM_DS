package defpackage;

import com.github.junrar.unpack.decode.Compress;
import java.lang.reflect.Array;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zz  reason: default package */
/* loaded from: classes.dex */
public final class zz {
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

    public zz(int i) {
        Class cls = Integer.TYPE;
        this.f = (int[][]) Array.newInstance(cls, 6, 258);
        this.g = (int[][]) Array.newInstance(cls, 6, 258);
        this.h = (int[][]) Array.newInstance(cls, 6, 258);
        this.i = new int[6];
        this.j = new int[Compress.MC20];
        this.k = new char[256];
        this.l = (char[][]) Array.newInstance(Character.TYPE, 6, 258);
        this.m = new byte[6];
        this.o = new byte[i * 100000];
    }
}
