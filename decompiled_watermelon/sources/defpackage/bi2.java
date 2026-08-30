package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bi2  reason: default package */
/* loaded from: classes.dex */
public final class bi2 implements vi6 {
    public final Context A;
    public final String B;
    public final sb L;
    public final boolean R;
    public final boolean X;
    public final il6 Y;
    public boolean Z;

    public bi2(Context context, String str, sb sbVar, boolean z, boolean z2) {
        context.getClass();
        sbVar.getClass();
        this.A = context;
        this.B = str;
        this.L = sbVar;
        this.R = z;
        this.X = z2;
        this.Y = new il6(new b5(26, this));
    }

    @Override // defpackage.vi6
    public final vh2 W() {
        return ((ai2) this.Y.getValue()).d(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        il6 il6Var = this.Y;
        if (il6Var.a()) {
            ((ai2) il6Var.getValue()).close();
        }
    }

    @Override // defpackage.vi6
    public final vh2 e0() {
        return ((ai2) this.Y.getValue()).d(true);
    }

    @Override // defpackage.vi6
    public final String getDatabaseName() {
        return this.B;
    }

    @Override // defpackage.vi6
    public final void setWriteAheadLoggingEnabled(boolean z) {
        il6 il6Var = this.Y;
        if (il6Var.a()) {
            ((ai2) il6Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.Z = z;
    }
}
