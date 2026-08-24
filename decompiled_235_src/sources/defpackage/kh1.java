package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kh1  reason: default package */
/* loaded from: classes.dex */
public final class kh1 implements Iterator, zf3 {
    public int A = -1;
    public int B;
    public int L;
    public l93 R;
    public int X;
    public final /* synthetic */ lh1 Y;

    public kh1(lh1 lh1Var) {
        this.Y = lh1Var;
        int q = gi2.q(0, 0, lh1Var.a.length());
        this.B = q;
        this.L = q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r7 < r4) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [j93, l93] */
    /* JADX WARN: Type inference failed for: r0v8, types: [j93, l93] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        lh1 lh1Var = this.Y;
        CharSequence charSequence = lh1Var.a;
        int i = this.L;
        int i2 = 0;
        if (i < 0) {
            this.A = 0;
            this.R = null;
            return;
        }
        int i3 = lh1Var.b;
        if (i3 > 0) {
            int i4 = this.X + 1;
            this.X = i4;
        }
        if (i <= charSequence.length()) {
            vr4 vr4Var = (vr4) lh1Var.c.o(charSequence, Integer.valueOf(this.L));
            if (vr4Var == null) {
                this.R = new j93(this.B, qs6.o0(charSequence), 1);
                this.L = -1;
            } else {
                int intValue = ((Number) vr4Var.A).intValue();
                int intValue2 = ((Number) vr4Var.B).intValue();
                this.R = gi2.R(this.B, intValue);
                int i5 = intValue + intValue2;
                this.B = i5;
                if (intValue2 == 0) {
                    i2 = 1;
                }
                this.L = i5 + i2;
            }
            this.A = 1;
        }
        this.R = new j93(this.B, qs6.o0(charSequence), 1);
        this.L = -1;
        this.A = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A == -1) {
            a();
        }
        if (this.A == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.A == -1) {
            a();
        }
        if (this.A != 0) {
            l93 l93Var = this.R;
            l93Var.getClass();
            this.R = null;
            this.A = -1;
            return l93Var;
        }
        fa6.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
