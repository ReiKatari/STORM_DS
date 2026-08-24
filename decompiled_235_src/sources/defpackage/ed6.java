package defpackage;

import android.util.Size;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed6  reason: default package */
/* loaded from: classes.dex */
public final class ed6 extends gk2 {
    public final Object R;
    public final i23 X;
    public final int Y;
    public final int Z;

    public ed6(s23 s23Var, Size size, i23 i23Var) {
        super(s23Var);
        this.R = new Object();
        if (size == null) {
            this.Y = this.B.getWidth();
            this.Z = this.B.getHeight();
        } else {
            this.Y = size.getWidth();
            this.Z = size.getHeight();
        }
        this.X = i23Var;
    }

    @Override // defpackage.gk2, defpackage.s23
    public final i23 S() {
        return this.X;
    }

    @Override // defpackage.gk2, defpackage.s23
    public final int getHeight() {
        return this.Z;
    }

    @Override // defpackage.gk2, defpackage.s23
    public final int getWidth() {
        return this.Y;
    }
}
