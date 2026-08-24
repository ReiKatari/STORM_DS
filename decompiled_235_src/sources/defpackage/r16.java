package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r16  reason: default package */
/* loaded from: classes.dex */
public final class r16 extends OrientationEventListener {
    public final /* synthetic */ t16 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r16(Context context, t16 t16Var) {
        super(context);
        this.a = t16Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
        if (r4 < 315) goto L38;
     */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOrientationChanged(int i) {
        int i2;
        List<s16> k1;
        if (i != -1) {
            t16 t16Var = this.a;
            if (t16Var.d == -1) {
                if (i < 0 || i >= 45) {
                    if (45 > i || i >= 135) {
                        if (135 > i || i >= 225) {
                            if (225 <= i) {
                            }
                        }
                        i2 = 2;
                    }
                    i2 = 3;
                }
                i2 = 0;
            } else {
                if ((i < 0 || i >= 40) && (320 > i || i >= 360)) {
                    if (50 > i || i >= 130) {
                        if (140 > i || i >= 220) {
                            if (230 > i || i >= 310) {
                                i2 = t16Var.d;
                            }
                            i2 = 1;
                        }
                        i2 = 2;
                    }
                    i2 = 3;
                }
                i2 = 0;
            }
            t16 t16Var2 = this.a;
            if (t16Var2.d != i2) {
                t16Var2.d = i2;
                synchronized (t16Var2.a) {
                    k1 = gt0.k1(t16Var2.c.values());
                }
                for (s16 s16Var : k1) {
                    s16Var.a(i2);
                }
            }
        }
    }
}
