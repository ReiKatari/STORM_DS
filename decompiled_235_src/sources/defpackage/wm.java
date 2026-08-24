package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wm  reason: default package */
/* loaded from: classes.dex */
public final class wm {
    public final XmlPullParser a;
    public int b = 0;
    public final t9 c;

    public wm(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        t9 t9Var = new t9();
        t9Var.b = new float[64];
        this.c = t9Var;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (xk2.v(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        b(typedArray.getChangingConfigurations());
        return f;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) obj;
        if (nb3.k(this.a, wmVar.a) && this.b == wmVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return xg6.q(sb, this.b, ')');
    }
}
