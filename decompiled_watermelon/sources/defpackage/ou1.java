package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ou1  reason: default package */
/* loaded from: classes.dex */
public final class ou1 extends pu1 {
    public final rg5 a;
    public final VideoRenderer b;
    public final vx2 c;

    public ou1(rg5 rg5Var, VideoRenderer videoRenderer, vx2 vx2Var) {
        rg5Var.getClass();
        videoRenderer.getClass();
        vx2Var.getClass();
        this.a = rg5Var;
        this.b = videoRenderer;
        this.c = vx2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou1)) {
            return false;
        }
        ou1 ou1Var = (ou1) obj;
        if (b53.x(this.a, ou1Var.a) && this.b == ou1Var.b && b53.x(this.c, ou1Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShowRomSettings(rom=" + this.a + ", renderer=" + this.b + ", menuState=" + this.c + ")";
    }
}
