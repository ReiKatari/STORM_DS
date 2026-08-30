package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iv5  reason: default package */
/* loaded from: classes.dex */
public final class iv5 {
    public final iv5 a;
    public final Object b = new Object();
    public boolean c;

    public iv5(iv5 iv5Var) {
        this.a = iv5Var;
    }

    public final void a() {
        synchronized (this.b) {
            try {
                if (this.c) {
                    iv5 iv5Var = this.a;
                    if (iv5Var != null) {
                        iv5Var.a();
                    } else {
                        ve2.w("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    ve2.c0("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
        }
    }
}
