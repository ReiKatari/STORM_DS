package defpackage;

import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ow0  reason: default package */
/* loaded from: classes.dex */
public final class ow0 implements InputManager.InputDeviceListener {
    public g11 a;
    public final ee6 b = fe6.a(null);
    public final ee6 c;
    public final q45 d;
    public final ee6 e;
    public final q45 f;

    public ow0() {
        ee6 a = fe6.a(pp1.A);
        this.c = a;
        this.d = new q45(a);
        ee6 a2 = fe6.a(qw0.a);
        this.e = a2;
        this.f = new q45(a2);
    }

    public static boolean a(InputDevice inputDevice) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = inputDevice.isEnabled();
        } else {
            z = true;
        }
        if (z && !inputDevice.isVirtual()) {
            if (inputDevice.supportsSource(1025) || inputDevice.supportsSource(16777232)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceAdded(int i) {
        ee6 ee6Var;
        Object value;
        ArrayList p1;
        InputDevice device = InputDevice.getDevice(i);
        if (device != null && a(device)) {
            do {
                ee6Var = this.c;
                value = ee6Var.getValue();
                p1 = tq0.p1((List) value);
                p1.add(device);
            } while (!ee6Var.j(value, p1));
        }
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int i) {
        ee6 ee6Var;
        Object value;
        ArrayList p1;
        do {
            ee6Var = this.c;
            value = ee6Var.getValue();
            p1 = tq0.p1((List) value);
            int size = p1.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    Object obj = p1.get(i3);
                    i3++;
                    InputDevice inputDevice = (InputDevice) obj;
                    inputDevice.getClass();
                    if (inputDevice.getId() == i) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                p1.remove(i2);
            }
            InputDevice device = InputDevice.getDevice(i);
            if (device != null && a(device)) {
                p1.add(device);
            }
        } while (!ee6Var.j(value, p1));
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int i) {
        ee6 ee6Var;
        Object value;
        List list;
        do {
            ee6Var = this.c;
            value = ee6Var.getValue();
            list = (List) value;
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((InputDevice) it.next()).getId() == i) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.remove(i2);
                list = arrayList;
            }
        } while (!ee6Var.j(value, list));
    }
}
