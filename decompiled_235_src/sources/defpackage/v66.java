package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v66  reason: default package */
/* loaded from: classes.dex */
public final class v66 {
    public final v66 a;
    public final Object b = new Object();
    public boolean c;

    public v66(v66 v66Var) {
        this.a = v66Var;
    }

    public final void a() {
        synchronized (this.b) {
            try {
                if (this.c) {
                    v66 v66Var = this.a;
                    if (v66Var != null) {
                        v66Var.a();
                    } else {
                        kj2.v("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    kj2.f0("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
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
