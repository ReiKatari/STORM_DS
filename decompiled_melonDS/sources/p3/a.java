package p3;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import l.i0;
import nc.k;
import org.xmlpull.v1.XmlPullParser;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final XmlPullParser f11297a;

    /* renamed from: b  reason: collision with root package name */
    public int f11298b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f11299c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f11297a = xmlResourceParser;
        i0 i0Var = new i0(12, false);
        i0Var.B = new float[64];
        this.f11299c = i0Var;
    }

    public final float a(TypedArray typedArray, String str, int i2, float f8) {
        if (p5.b.e(this.f11297a, str)) {
            f8 = typedArray.getFloat(i2, f8);
        }
        b(typedArray.getChangingConfigurations());
        return f8;
    }

    public final void b(int i2) {
        this.f11298b = i2 | this.f11298b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (k.a(this.f11297a, aVar.f11297a) && this.f11298b == aVar.f11298b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11298b) + (this.f11297a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f11297a);
        sb2.append(", config=");
        return d.p(sb2, this.f11298b, ')');
    }
}
