package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z70  reason: default package */
/* loaded from: classes.dex */
public final class z70 extends gc5 {
    public final bg1 B;
    public final String L;
    public final String R;
    public final s45 X;

    public z70(bg1 bg1Var, String str, String str2) {
        this.B = bg1Var;
        this.L = str;
        this.R = str2;
        this.X = new s45(new q20((sb6) bg1Var.L.get(1), this));
    }

    @Override // defpackage.gc5
    public final long d() {
        String str = this.R;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = gk7.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // defpackage.gc5
    public final cw3 i() {
        String str = this.L;
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
        return this.X;
    }
}
