package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu2  reason: default package */
/* loaded from: classes.dex */
public final class uu2 implements GenericArrayType {
    public final /* synthetic */ int A;
    public final Type B;

    public uu2(int i, Type type) {
        this.A = i;
        switch (i) {
            case 1:
                this.B = type;
                return;
            default:
                Objects.requireNonNull(type);
                this.B = q60.l(type);
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof GenericArrayType) || !q60.z(this, (GenericArrayType) obj)) {
                    return false;
                }
                return true;
            default:
                if (!(obj instanceof GenericArrayType) || !ak7.Q(this, (GenericArrayType) obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        switch (this.A) {
            case 0:
                return this.B;
            default:
                return this.B;
        }
    }

    public final int hashCode() {
        switch (this.A) {
            case 0:
                return this.B.hashCode();
            default:
                return this.B.hashCode();
        }
    }

    public final String toString() {
        int i = this.A;
        Type type = this.B;
        switch (i) {
            case 0:
                return q60.b0(type) + "[]";
            default:
                return ak7.J0(type) + "[]";
        }
    }
}
