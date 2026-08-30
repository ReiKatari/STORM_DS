package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g55  reason: default package */
/* loaded from: classes.dex */
public final class g55 extends gc5 {
    public final String B;
    public final long L;
    public final s45 R;

    public g55(String str, long j, s45 s45Var) {
        this.B = str;
        this.L = j;
        this.R = s45Var;
    }

    @Override // defpackage.gc5
    public final long d() {
        return this.L;
    }

    @Override // defpackage.gc5
    public final cw3 i() {
        String str = this.B;
        if (str != null) {
            h85 h85Var = cw3.d;
            try {
                return hi2.n(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.gc5
    public final u60 p() {
        return this.R;
    }
}
