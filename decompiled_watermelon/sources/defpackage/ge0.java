package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ge0  reason: default package */
/* loaded from: classes.dex */
public final class ge0 {
    public final Context a;
    public final ie0 b;
    public final q03 c;
    public final ee0 d;
    public final fe0 e;
    public final he0 f;

    /* JADX WARN: Type inference failed for: r2v0, types: [he0, java.lang.Object] */
    public ge0(Context context, ie0 ie0Var, fe0 fe0Var) {
        q03 q03Var = new q03(19);
        ee0 ee0Var = new ee0();
        ?? obj = new Object();
        this.a = context;
        this.b = ie0Var;
        this.c = q03Var;
        this.d = ee0Var;
        this.e = fe0Var;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ge0) {
                ge0 ge0Var = (ge0) obj;
                if (!b53.x(this.a, ge0Var.a) || !b53.x(this.b, ge0Var.b) || !b53.x(this.c, ge0Var.c) || !b53.x(this.d, ge0Var.d) || !b53.x(this.e, ge0Var.e) || !b53.x(this.f, ge0Var.f)) {
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
