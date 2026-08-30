package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y94  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class y94 implements kv4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ y94(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        switch (this.a) {
            case 0:
                return kv4.class;
            default:
                return kv4.class;
        }
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                if ((obj instanceof kv4) && i2 == ((kv4) obj).number()) {
                    return true;
                }
                return false;
            default:
                if ((obj instanceof kv4) && i2 == ((kv4) obj).number()) {
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

    @Override // defpackage.kv4
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
                return wh1.j("@kotlinx.serialization.protobuf.ProtoNumber(number=", this.b, ")");
            default:
                return wh1.j("@kotlinx.serialization.protobuf.ProtoNumber(number=", this.b, ")");
        }
    }
}
