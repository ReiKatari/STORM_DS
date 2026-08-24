package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pg0  reason: default package */
/* loaded from: classes.dex */
public final class pg0 {
    public final Context a;
    public final rg0 b;
    public final u63 c;
    public final ng0 d;
    public final og0 e;
    public final qg0 f;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, qg0] */
    public pg0(Context context, rg0 rg0Var, og0 og0Var) {
        u63 u63Var = new u63(19);
        ng0 ng0Var = new ng0(0);
        ?? obj = new Object();
        this.a = context;
        this.b = rg0Var;
        this.c = u63Var;
        this.d = ng0Var;
        this.e = og0Var;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pg0) {
                pg0 pg0Var = (pg0) obj;
                if (!nb3.k(this.a, pg0Var.a) || !nb3.k(this.b, pg0Var.b) || !nb3.k(this.c, pg0Var.c) || !nb3.k(this.d, pg0Var.d) || !nb3.k(this.e, pg0Var.e) || !nb3.k(this.f, pg0Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        this.f.getClass();
        return (Boolean.hashCode(false) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 961)) * 31;
    }

    public final String toString() {
        return "Config(appContext=" + this.a + ", threadConfig=" + this.b + ", cameraMetadataConfig=" + this.c + ", cameraBackendConfig=" + this.d + ", cameraInteropConfig=" + this.e + ", imageSources=null, flags=" + this.f + ", platformApiCompat=null)";
    }
}
