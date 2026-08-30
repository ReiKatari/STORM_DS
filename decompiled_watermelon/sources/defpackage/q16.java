package defpackage;

import android.util.Size;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q16  reason: default package */
/* loaded from: classes.dex */
public final class q16 extends hf2 {
    public final Object R;
    public final ew2 X;
    public final int Y;
    public final int Z;

    public q16(ow2 ow2Var, Size size, ew2 ew2Var) {
        super(ow2Var);
        this.R = new Object();
        if (size == null) {
            this.Y = this.B.c();
            this.Z = this.B.a();
        } else {
            this.Y = size.getWidth();
            this.Z = size.getHeight();
        }
        this.X = ew2Var;
    }

    @Override // defpackage.hf2, defpackage.ow2
    public final int a() {
        return this.Z;
    }

    @Override // defpackage.hf2, defpackage.ow2
    public final int c() {
        return this.Y;
    }

    @Override // defpackage.hf2, defpackage.ow2
    public final ew2 s() {
        return this.X;
    }
}
