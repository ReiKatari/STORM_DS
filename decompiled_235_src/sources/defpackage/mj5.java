package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mj5  reason: default package */
/* loaded from: classes.dex */
public final class mj5 {
    public final int a;
    public final String b;

    public mj5(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mj5) {
                mj5 mj5Var = (mj5) obj;
                if (this.a != mj5Var.a || !this.b.equals(mj5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Renderer2DCompModeItem(mode=" + this.a + ", label=" + this.b + ")";
    }
}
