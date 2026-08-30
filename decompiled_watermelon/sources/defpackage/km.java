package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: km  reason: default package */
/* loaded from: classes.dex */
public final class km {
    public final XmlPullParser a;
    public int b = 0;
    public final s9 c;

    public km(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        s9 s9Var = new s9();
        s9Var.b = new float[64];
        this.c = s9Var;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (gk2.U(this.a, str)) {
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
        if (!(obj instanceof km)) {
            return false;
        }
        km kmVar = (km) obj;
        if (b53.x(this.a, kmVar.a) && this.b == kmVar.b) {
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
        return ej6.g(sb, this.b, ')');
    }
}
