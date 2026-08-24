package me.magnum.melonds.ui.inputsetup;

import android.os.Bundle;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class InputSetupActivity extends sx2 {
    public static final /* synthetic */ int D0 = 0;
    public final uo7 B0;
    public final LinkedHashMap C0;

    public InputSetupActivity() {
        super(1);
        this.B0 = new uo7(gh5.a(b.class), new i73(this, 1), new i73(this, 0), new i73(this, 2));
        this.C0 = new LinkedHashMap();
    }

    public final b B() {
        return (b) this.B0.getValue();
    }

    @Override // defpackage.jq, defpackage.lv0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && B().j.A.getValue() != null && keyEvent.getKeyCode() != 4) {
            b B = B();
            int keyCode = keyEvent.getKeyCode();
            b63 b63Var = (b63) B.i.getValue();
            if (b63Var != null) {
                B.g(b63Var, new f63(keyCode, null));
                B.e(b63Var);
                return true;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.sx2, androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(ht.a().getThemeResId());
        tr1.a(this, new ix6(0, 0, 2, new r76(18)));
        super.onCreate(bundle);
        nv0.a(this, new zv0(1790543048, true, new f73(this, 0)));
        hv.L(bl2.C(this), null, null, new h73(this, null, 1), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [yt1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List] */
    @Override // android.app.Activity
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        LinkedHashMap linkedHashMap;
        Object obj;
        float f;
        kk6 a;
        d63 d63Var;
        float f2;
        List<InputDevice.MotionRange> motionRanges;
        motionEvent.getClass();
        b63 b63Var = (b63) B().j.A.getValue();
        b.a aVar = (b.a) B().l.A.getValue();
        if ((b63Var != null || aVar != null) && ((motionEvent.isFromSource(16) || motionEvent.isFromSource(16777232) || motionEvent.isFromSource(1025)) && motionEvent.getAction() == 2)) {
            InputDevice device = motionEvent.getDevice();
            ?? r5 = yt1.A;
            if (device != null && (motionRanges = device.getMotionRanges()) != null) {
                ol1 ol1Var = new ol1(new qd2(new pc2(new ev(motionRanges, 1), true, new bz1(this)), new bz1(24), 2).iterator(), new gn5(23));
                if (ol1Var.hasNext()) {
                    Object next = ol1Var.next();
                    if (!ol1Var.hasNext()) {
                        r5 = hf.b0(next);
                    } else {
                        r5 = new ArrayList();
                        r5.add(next);
                        while (ol1Var.hasNext()) {
                            r5.add(ol1Var.next());
                        }
                    }
                }
            }
            Iterator it = r5.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                linkedHashMap = this.C0;
                if (hasNext) {
                    obj = it.next();
                    int intValue = ((Number) obj).intValue();
                    Float f3 = (Float) linkedHashMap.get(new vr4(Integer.valueOf(motionEvent.getDeviceId()), Integer.valueOf(intValue)));
                    if (f3 != null) {
                        f2 = f3.floatValue();
                    } else {
                        f2 = 0.0f;
                    }
                    if (Math.abs(motionEvent.getAxisValue(intValue) - f2) >= 0.5f) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                Float f4 = (Float) linkedHashMap.get(new vr4(Integer.valueOf(motionEvent.getDeviceId()), num));
                if (f4 != null) {
                    f = f4.floatValue();
                } else {
                    f = 0.0f;
                }
                float axisValue = motionEvent.getAxisValue(num.intValue()) - f;
                if (b63Var != null) {
                    if (axisValue > RecyclerView.B1) {
                        d63Var = d63.POSITIVE;
                    } else {
                        d63Var = d63.NEGATIVE;
                    }
                    b B = B();
                    int intValue2 = num.intValue();
                    d63Var.getClass();
                    b63 b63Var2 = (b63) B.i.getValue();
                    if (b63Var2 != null) {
                        B.g(b63Var2, new e63(null, intValue2, d63Var));
                        B.e(b63Var2);
                        return true;
                    }
                } else {
                    b B2 = B();
                    int intValue3 = num.intValue();
                    int deviceId = motionEvent.getDeviceId();
                    tp6 tp6Var = B2.k;
                    b.a aVar2 = (b.a) tp6Var.getValue();
                    if (aVar2 != null) {
                        kk6 kk6Var = (kk6) B2.g.getValue();
                        int i = c.a[aVar2.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                a = kk6.a(kk6Var, Integer.valueOf(deviceId), false, 0, intValue3, false, false, RecyclerView.B1, 118);
                            } else {
                                i.d();
                                return false;
                            }
                        } else {
                            a = kk6.a(kk6Var, Integer.valueOf(deviceId), false, intValue3, 0, false, false, RecyclerView.B1, 122);
                        }
                        B2.h(a);
                        tp6Var.l(null);
                    }
                }
            }
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }
}
