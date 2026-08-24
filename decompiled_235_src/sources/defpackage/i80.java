package defpackage;

import java.io.Closeable;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i80  reason: default package */
/* loaded from: classes.dex */
public final class i80 implements Closeable {
    public k80 A;
    public boolean B;
    public o96 L;
    public byte[] X;
    public long R = -1;
    public int Y = -1;
    public int Z = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A != null) {
            this.A = null;
            this.L = null;
            this.R = -1L;
            this.X = null;
            this.Y = -1;
            this.Z = -1;
            return;
        }
        i.m("not attached to a buffer");
    }

    public final void e(long j) {
        k80 k80Var = this.A;
        if (k80Var != null) {
            if (this.B) {
                long j2 = k80Var.B;
                int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i <= 0) {
                    if (j >= 0) {
                        long j3 = j2 - j;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            o96 o96Var = k80Var.A;
                            o96Var.getClass();
                            o96 o96Var2 = o96Var.g;
                            o96Var2.getClass();
                            int i2 = o96Var2.c;
                            long j4 = i2 - o96Var2.b;
                            if (j4 <= j3) {
                                k80Var.A = o96Var2.a();
                                r96.a(o96Var2);
                                j3 -= j4;
                            } else {
                                o96Var2.c = i2 - ((int) j3);
                                break;
                            }
                        }
                        this.L = null;
                        this.R = j;
                        this.X = null;
                        this.Y = -1;
                        this.Z = -1;
                    } else {
                        i.f(lb1.h(j, "newSize < 0: "));
                        return;
                    }
                } else if (i > 0) {
                    long j5 = j - j2;
                    int i3 = 1;
                    boolean z = true;
                    for (long j6 = 0; j5 > j6; j6 = 0) {
                        o96 j0 = k80Var.j0(i3);
                        int min = (int) Math.min(j5, 8192 - j0.c);
                        int i4 = j0.c + min;
                        j0.c = i4;
                        j5 -= min;
                        if (z) {
                            this.L = j0;
                            this.R = j2;
                            this.X = j0.a;
                            this.Y = i4 - min;
                            this.Z = i4;
                            z = false;
                        }
                        i3 = 1;
                    }
                }
                k80Var.B = j;
                return;
            }
            i.m("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        i.m("not attached to a buffer");
    }

    public final int h(long j) {
        int i;
        long j2;
        k80 k80Var = this.A;
        if (k80Var != null) {
            int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if (i2 >= 0 && j <= (k80Var.B)) {
                if (i2 != 0 && i != 0) {
                    o96 o96Var = k80Var.A;
                    o96 o96Var2 = this.L;
                    long j3 = 0;
                    if (o96Var2 != null) {
                        long j4 = this.R - (this.Y - o96Var2.b);
                        if (j4 > j) {
                            o96Var2 = o96Var;
                            o96Var = o96Var2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        o96Var2 = o96Var;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            o96Var2.getClass();
                            long j5 = (o96Var2.c - o96Var2.b) + j3;
                            if (j < j5) {
                                break;
                            }
                            o96Var2 = o96Var2.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            o96Var.getClass();
                            o96Var = o96Var.g;
                            o96Var.getClass();
                            j2 -= o96Var.c - o96Var.b;
                        }
                        o96Var2 = o96Var;
                        j3 = j2;
                    }
                    if (this.B) {
                        o96Var2.getClass();
                        if (o96Var2.d) {
                            byte[] bArr = o96Var2.a;
                            o96 o96Var3 = new o96(Arrays.copyOf(bArr, bArr.length), o96Var2.b, o96Var2.c, false, true);
                            if (k80Var.A == o96Var2) {
                                k80Var.A = o96Var3;
                            }
                            o96Var2.b(o96Var3);
                            o96 o96Var4 = o96Var3.g;
                            o96Var4.getClass();
                            o96Var4.a();
                            o96Var2 = o96Var3;
                        }
                    }
                    this.L = o96Var2;
                    this.R = j;
                    o96Var2.getClass();
                    this.X = o96Var2.a;
                    int i3 = o96Var2.b + ((int) (j - j3));
                    this.Y = i3;
                    int i4 = o96Var2.c;
                    this.Z = i4;
                    return i4 - i3;
                }
                this.L = null;
                this.R = j;
                this.X = null;
                this.Y = -1;
                this.Z = -1;
                return -1;
            }
            StringBuilder s = xg6.s(j, "offset=", " > size=");
            s.append(k80Var.B);
            throw new ArrayIndexOutOfBoundsException(s.toString());
        }
        i.m("not attached to a buffer");
        return 0;
    }
}
