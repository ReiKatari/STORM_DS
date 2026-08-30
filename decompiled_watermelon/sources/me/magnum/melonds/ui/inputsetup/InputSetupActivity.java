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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class InputSetupActivity extends rr2 {
    public static final /* synthetic */ int C0 = 0;
    public final va7 A0;
    public final LinkedHashMap B0;

    public InputSetupActivity() {
        super(1);
        this.A0 = new va7(q75.a(b.class), new e13(this, 1), new e13(this, 0), new e13(this, 2));
        this.B0 = new LinkedHashMap();
    }

    public final b B() {
        return (b) this.A0.getValue();
    }

    @Override // defpackage.xp, defpackage.xs0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && B().j.A.getValue() != null && keyEvent.getKeyCode() != 4) {
            b B = B();
            int keyCode = keyEvent.getKeyCode();
            yz2 yz2Var = (yz2) B.i.getValue();
            if (yz2Var != null) {
                B.g(yz2Var, new c03(keyCode, null));
                B.e(yz2Var);
                return true;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.rr2, androidx.fragment.app.p, defpackage.ys0, defpackage.xs0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        jn1.a(this, new ml6(0, 0, 2, new d96(6)), 2);
        super.onCreate(bundle);
        zs0.a(this, new et0(1790543048, true, new b13(this, 0)));
        tq5.w(hk2.y(this), null, null, new d13(this, null, 1), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [pp1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List] */
    @Override // android.app.Activity
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        LinkedHashMap linkedHashMap;
        Object obj;
        float f;
        u86 a;
        a03 a03Var;
        float f2;
        List<InputDevice.MotionRange> motionRanges;
        motionEvent.getClass();
        yz2 yz2Var = (yz2) B().j.A.getValue();
        b.a aVar = (b.a) B().l.A.getValue();
        if ((yz2Var != null || aVar != null) && ((motionEvent.isFromSource(16) || motionEvent.isFromSource(16777232) || motionEvent.isFromSource(1025)) && motionEvent.getAction() == 2)) {
            InputDevice device = motionEvent.getDevice();
            ?? r5 = pp1.A;
            if (device != null && (motionRanges = device.getMotionRanges()) != null) {
                kh1 kh1Var = new kh1(new y82(new w72(new mu(1, motionRanges), true, new qu1(this)), new qu1(13), 2).iterator(), new nh5(12));
                if (kh1Var.hasNext()) {
                    Object next = kh1Var.next();
                    if (!kh1Var.hasNext()) {
                        r5 = l07.b0(next);
                    } else {
                        r5 = new ArrayList();
                        r5.add(next);
                        while (kh1Var.hasNext()) {
                            r5.add(kh1Var.next());
                        }
                    }
                }
            }
            Iterator it = r5.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                linkedHashMap = this.B0;
                if (hasNext) {
                    obj = it.next();
                    int intValue = ((Number) obj).intValue();
                    Float f3 = (Float) linkedHashMap.get(new ti4(Integer.valueOf(motionEvent.getDeviceId()), Integer.valueOf(intValue)));
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
                Float f4 = (Float) linkedHashMap.get(new ti4(Integer.valueOf(motionEvent.getDeviceId()), num));
                if (f4 != null) {
                    f = f4.floatValue();
                } else {
                    f = 0.0f;
                }
                float axisValue = motionEvent.getAxisValue(num.intValue()) - f;
                if (yz2Var != null) {
                    if (axisValue > RecyclerView.A1) {
                        a03Var = a03.POSITIVE;
                    } else {
                        a03Var = a03.NEGATIVE;
                    }
                    b B = B();
                    int intValue2 = num.intValue();
                    a03Var.getClass();
                    yz2 yz2Var2 = (yz2) B.i.getValue();
                    if (yz2Var2 != null) {
                        B.g(yz2Var2, new b03(null, intValue2, a03Var));
                        B.e(yz2Var2);
                        return true;
                    }
                } else {
                    b B2 = B();
                    int intValue3 = num.intValue();
                    int deviceId = motionEvent.getDeviceId();
                    ee6 ee6Var = B2.k;
                    b.a aVar2 = (b.a) ee6Var.getValue();
                    if (aVar2 != null) {
                        u86 u86Var = (u86) B2.g.getValue();
                        int i = c.a[aVar2.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                a = u86.a(u86Var, Integer.valueOf(deviceId), false, 0, intValue3, false, false, RecyclerView.A1, 118);
                            } else {
                                i.c();
                                return false;
                            }
                        } else {
                            a = u86.a(u86Var, Integer.valueOf(deviceId), false, intValue3, 0, false, false, RecyclerView.A1, 122);
                        }
                        B2.h(a);
                        ee6Var.k(null);
                    }
                }
            }
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }
}
