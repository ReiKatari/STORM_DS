package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r67  reason: default package */
/* loaded from: classes.dex */
public final class r67 extends j67 {
    public final jo2 b;
    public String c;
    public boolean d;
    public final dk1 e;
    public ki2 f;
    public final tj4 g;
    public b30 h;
    public final tj4 i;
    public long j;
    public float k;
    public float l;
    public final q67 m;

    public r67(jo2 jo2Var) {
        this.b = jo2Var;
        jo2Var.i = new q67(this, 0);
        this.c = "";
        this.d = true;
        this.e = new dk1();
        this.f = mv0.n0;
        this.g = me2.G(null);
        this.i = me2.G(new i76(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new q67(this, 1);
    }

    @Override // defpackage.j67
    public final void a(hk1 hk1Var) {
        e(hk1Var, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        if (r3 != r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0108, code lost:
        if (r9.d == r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.hk1 r32, float r33, defpackage.b30 r34) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r67.e(hk1, float, b30):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        tj4 tj4Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((i76) tj4Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((i76) tj4Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
