package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: so2  reason: default package */
/* loaded from: classes.dex */
public final class so2 implements GenericArrayType {
    public final /* synthetic */ int A;
    public final Type B;

    public so2(int i, Type type) {
        this.A = i;
        switch (i) {
            case 1:
                this.B = type;
                return;
            default:
                Objects.requireNonNull(type);
                this.B = l07.u(type);
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof GenericArrayType) || !l07.I(this, (GenericArrayType) obj)) {
                    return false;
                }
                return true;
            default:
                if (!(obj instanceof GenericArrayType) || !ct3.b0(this, (GenericArrayType) obj)) {
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
                return l07.w0(type) + "[]";
            default:
                return ct3.W0(type) + "[]";
        }
    }
}
