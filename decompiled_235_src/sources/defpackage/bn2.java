package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bn2  reason: default package */
/* loaded from: classes.dex */
public final class bn2 implements pu6 {
    public final Context A;
    public final String B;
    public final zb L;
    public final boolean R;
    public final boolean X;
    public final ex6 Y;
    public boolean Z;

    public bn2(Context context, String str, zb zbVar, boolean z, boolean z2) {
        context.getClass();
        zbVar.getClass();
        this.A = context;
        this.B = str;
        this.L = zbVar;
        this.R = z;
        this.X = z2;
        this.Y = new ex6(new a5(this, 28));
    }

    @Override // defpackage.pu6
    public final vm2 G() {
        return ((an2) this.Y.getValue()).e(false);
    }

    @Override // defpackage.pu6
    public final vm2 I() {
        return ((an2) this.Y.getValue()).e(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ex6 ex6Var = this.Y;
        if (ex6Var.a()) {
            ((an2) ex6Var.getValue()).close();
        }
    }

    @Override // defpackage.pu6
    public final String getDatabaseName() {
        return this.B;
    }

    @Override // defpackage.pu6
    public final void setWriteAheadLoggingEnabled(boolean z) {
        ex6 ex6Var = this.Y;
        if (ex6Var.a()) {
            ((an2) ex6Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.Z = z;
    }
}
