package defpackage;

import android.util.Size;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mg4  reason: default package */
/* loaded from: classes.dex */
public abstract class mg4 {
    public final Size a;
    public final int b;
    public final String c;
    public final og4 d;
    public final ng4 e;
    public final pg4 f;
    public final qg4 g;
    public final List h;

    public mg4(Size size, int i, String str, og4 og4Var, ng4 ng4Var, pg4 pg4Var, qg4 qg4Var, List list) {
        size.getClass();
        this.a = size;
        this.b = i;
        this.c = str;
        this.d = og4Var;
        this.e = ng4Var;
        this.f = pg4Var;
        this.g = qg4Var;
        this.h = list;
    }

    public final String toString() {
        String b;
        StringBuilder sb = new StringBuilder("Config(size=");
        sb.append(this.a);
        sb.append(", format=");
        sb.append((Object) pf6.b(this.b));
        sb.append(", camera=");
        String str = this.c;
        if (str == null) {
            b = "null";
        } else {
            b = od0.b(str);
        }
        sb.append((Object) b);
        sb.append(", mirrorMode=");
        sb.append(this.d);
        sb.append(", timestampBase=null, dynamicRangeProfile=");
        sb.append(this.e);
        sb.append(", streamUseCase=");
        sb.append(this.f);
        sb.append(", streamUseHint=");
        sb.append(this.g);
        sb.append(", sensorPixelModes=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}
