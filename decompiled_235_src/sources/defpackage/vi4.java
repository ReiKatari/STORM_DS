package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vi4 implements r45 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ vi4(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        switch (this.a) {
            case 0:
                return r45.class;
            default:
                return r45.class;
        }
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                if ((obj instanceof r45) && i2 == ((r45) obj).number()) {
                    return true;
                }
                return false;
            default:
                if ((obj instanceof r45) && i2 == ((r45) obj).number()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        int hashCode;
        switch (this.a) {
            case 0:
                hashCode = Integer.hashCode(this.b);
                break;
            default:
                hashCode = Integer.hashCode(this.b);
                break;
        }
        return hashCode ^ 1779747127;
    }

    @Override // defpackage.r45
    public final /* synthetic */ int number() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        switch (this.a) {
            case 0:
                return lb1.k("@kotlinx.serialization.protobuf.ProtoNumber(number=", this.b, ")");
            default:
                return lb1.k("@kotlinx.serialization.protobuf.ProtoNumber(number=", this.b, ")");
        }
    }
}
