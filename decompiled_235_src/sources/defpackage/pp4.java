package defpackage;

import android.util.Size;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pp4  reason: default package */
/* loaded from: classes.dex */
public abstract class pp4 {
    public final Size a;
    public final int b;
    public final String c;
    public final rp4 d;
    public final qp4 e;
    public final sp4 f;
    public final tp4 g;
    public final List h;

    public pp4(Size size, int i, String str, rp4 rp4Var, qp4 qp4Var, sp4 sp4Var, tp4 tp4Var, List list) {
        size.getClass();
        this.a = size;
        this.b = i;
        this.c = str;
        this.d = rp4Var;
        this.e = qp4Var;
        this.f = sp4Var;
        this.g = tp4Var;
        this.h = list;
    }

    public final String toString() {
        String b;
        StringBuilder sb = new StringBuilder("Config(size=");
        sb.append(this.a);
        sb.append(", format=");
        sb.append((Object) fr6.b(this.b));
        sb.append(", camera=");
        String str = this.c;
        if (str == null) {
            b = "null";
        } else {
            b = xf0.b(str);
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
