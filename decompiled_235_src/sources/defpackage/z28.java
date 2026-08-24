package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z28  reason: default package */
/* loaded from: classes.dex */
public final class z28 implements Iterator {
    public String A;
    public final String L;
    public final boolean R;
    public final /* synthetic */ j97 Z;
    public int B = 2;
    public int X = 0;
    public int Y = Integer.MAX_VALUE;

    public z28(j97 j97Var, g60 g60Var, String str) {
        this.Z = j97Var;
        this.R = g60Var.A;
        this.L = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        String str;
        int i2;
        int i3 = this.B;
        if (i3 != 4) {
            int i4 = i3 - 1;
            String str2 = null;
            if (i3 != 0) {
                if (i4 == 0) {
                    return true;
                }
                if (i4 != 2) {
                    this.B = 4;
                    int i5 = this.X;
                    while (true) {
                        i = this.X;
                        if (i != -1) {
                            str = this.L;
                            int length = str.length();
                            su7.c(i, length);
                            while (true) {
                                if (i < length) {
                                    if (str.charAt(i) == ((y28) this.Z.B).a) {
                                        break;
                                    }
                                    i++;
                                } else {
                                    i = -1;
                                    break;
                                }
                            }
                            if (i == -1) {
                                i = str.length();
                                this.X = -1;
                                i2 = -1;
                            } else {
                                i2 = i + 1;
                                this.X = i2;
                            }
                            if (i2 == i5) {
                                int i6 = i2 + 1;
                                this.X = i6;
                                if (i6 > str.length()) {
                                    this.X = -1;
                                }
                            } else {
                                if (i5 < i) {
                                    str.charAt(i5);
                                }
                                if (i5 < i) {
                                    str.charAt(i - 1);
                                }
                                if (!this.R || i5 != i) {
                                    break;
                                }
                                i5 = this.X;
                            }
                        } else {
                            this.B = 3;
                            break;
                        }
                    }
                    int i7 = this.Y;
                    if (i7 == 1) {
                        i = str.length();
                        this.X = -1;
                        if (i > i5) {
                            str.charAt(i - 1);
                        }
                    } else {
                        this.Y = i7 - 1;
                    }
                    str2 = str.subSequence(i5, i).toString();
                    this.A = str2;
                    if (this.B != 3) {
                        this.B = 1;
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        e41.m();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.B = 2;
            String str = this.A;
            this.A = null;
            return str;
        }
        fa6.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
