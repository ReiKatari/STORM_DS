package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ m0(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    private final void a() {
        uv2 uv2Var = (uv2) this.B;
        synchronized (uv2Var.r0) {
            try {
                uv2Var.t0 = null;
                ow2 ow2Var = uv2Var.s0;
                if (ow2Var != null) {
                    uv2Var.s0 = null;
                    uv2Var.f(ow2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03e7  */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0.run():void");
    }
}
