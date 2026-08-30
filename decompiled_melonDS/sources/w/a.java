package w;

import android.util.Size;
import j0.l2;
import j0.w1;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f13864a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f13865b;

    /* renamed from: c  reason: collision with root package name */
    public final w1 f13866c;

    /* renamed from: d  reason: collision with root package name */
    public final l2 f13867d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f13868e;

    /* renamed from: f  reason: collision with root package name */
    public final j0.k f13869f;

    /* renamed from: g  reason: collision with root package name */
    public final List f13870g;

    public a(String str, Class cls, w1 w1Var, l2 l2Var, Size size, j0.k kVar, ArrayList arrayList) {
        this.f13864a = str;
        this.f13865b = cls;
        if (w1Var != null) {
            this.f13866c = w1Var;
            if (l2Var != null) {
                this.f13867d = l2Var;
                this.f13868e = size;
                this.f13869f = kVar;
                this.f13870g = arrayList;
                return;
            }
            m9.o.i("Null useCaseConfig");
            throw null;
        }
        m9.o.i("Null sessionConfig");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f13864a.equals(aVar.f13864a) && this.f13865b.equals(aVar.f13865b) && this.f13866c.equals(aVar.f13866c) && this.f13867d.equals(aVar.f13867d)) {
                    Size size = aVar.f13868e;
                    Size size2 = this.f13868e;
                    if (size2 == null) {
                        if (size != null) {
                            return false;
                        }
                    } else if (!size2.equals(size)) {
                        return false;
                    }
                    j0.k kVar = aVar.f13869f;
                    j0.k kVar2 = this.f13869f;
                    if (kVar2 == null) {
                        if (kVar != null) {
                            return false;
                        }
                    } else if (!kVar2.equals(kVar)) {
                        return false;
                    }
                    List list = aVar.f13870g;
                    List list2 = this.f13870g;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                        return false;
                    } else if (list2.equals(list)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((((((this.f13864a.hashCode() ^ 1000003) * 1000003) ^ this.f13865b.hashCode()) * 1000003) ^ this.f13866c.hashCode()) * 1000003) ^ this.f13867d.hashCode()) * 1000003;
        int i2 = 0;
        Size size = this.f13868e;
        if (size == null) {
            hashCode = 0;
        } else {
            hashCode = size.hashCode();
        }
        int i10 = (hashCode3 ^ hashCode) * 1000003;
        j0.k kVar = this.f13869f;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        List list = this.f13870g;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i11 ^ i2;
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f13864a + ", useCaseType=" + this.f13865b + ", sessionConfig=" + this.f13866c + ", useCaseConfig=" + this.f13867d + ", surfaceResolution=" + this.f13868e + ", streamSpec=" + this.f13869f + ", captureTypes=" + this.f13870g + "}";
    }
}
