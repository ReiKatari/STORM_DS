package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz  reason: default package */
/* loaded from: classes.dex */
public final class uz {
    public final bf0 a;
    public final vd b;

    public uz(bf0 bf0Var, vd vdVar) {
        this.a = bf0Var;
        this.b = vdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz)) {
            return false;
        }
        uz uzVar = (uz) obj;
        if (nb3.k(this.a, uzVar.a) && nb3.k(this.b, uzVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        bf0 bf0Var = this.a;
        if (bf0Var == null) {
            hashCode = 0;
        } else {
            hashCode = bf0Var.hashCode();
        }
        int i2 = hashCode * 31;
        vd vdVar = this.b;
        if (vdVar != null) {
            i = vdVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "AwaitOpenCameraResult(cameraDeviceWrapper=" + this.a + ", androidCameraState=" + this.b + ')';
    }
}
