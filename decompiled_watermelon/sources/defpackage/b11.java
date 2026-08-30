package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b11  reason: default package */
/* loaded from: classes.dex */
public final class b11 implements cr4 {
    public final ki2 a;

    @Override // defpackage.cr4
    public long a(e33 e33Var, long j, sd3 sd3Var, long j2) {
        long j3;
        boolean z;
        int i = e33Var.a + ((int) (((a33) this.a.c()).a >> 32));
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j >> 32);
        if (sd3Var == sd3.Ltr) {
            z = true;
        } else {
            z = false;
        }
        return (dt3.T(e33Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (dt3.T(i, i2, i3, z) << 32);
    }
}
