package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ig3  reason: default package */
/* loaded from: classes.dex */
public final class ig3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg3 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ig3(jg3 jg3Var, Object obj, int i) {
        this.a = i;
        this.b = jg3Var;
        this.c = obj;
    }

    public bg3 b() {
        jg3 jg3Var = this.b;
        vf3 vf3Var = (vf3) jg3Var.e0.g(this.c);
        if (vf3Var != null) {
            return (bg3) jg3Var.Y.g(vf3Var);
        }
        return null;
    }

    public final boolean c() {
        ql4 ql4Var;
        switch (this.a) {
            case 0:
                return true;
            default:
                bg3 b = b();
                if (b == null || (ql4Var = b.f) == null) {
                    return true;
                }
                return ql4Var.c();
        }
    }

    private final void a() {
    }
}
