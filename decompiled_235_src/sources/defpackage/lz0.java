package defpackage;

import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lz0  reason: default package */
/* loaded from: classes.dex */
public final class lz0 implements InputManager.InputDeviceListener {
    public o41 a;
    public final tp6 b = up6.a(null);
    public final tp6 c;
    public final de5 d;
    public final tp6 e;
    public final de5 f;

    public lz0() {
        tp6 a = up6.a(yt1.A);
        this.c = a;
        this.d = new de5(a);
        tp6 a2 = up6.a(nz0.a);
        this.e = a2;
        this.f = new de5(a2);
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
        tp6 tp6Var;
        Object value;
        ArrayList m1;
        InputDevice device = InputDevice.getDevice(i);
        if (device != null && a(device)) {
            do {
                tp6Var = this.c;
                value = tp6Var.getValue();
                m1 = gt0.m1((List) value);
                m1.add(device);
            } while (!tp6Var.j(value, m1));
        }
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int i) {
        tp6 tp6Var;
        Object value;
        ArrayList m1;
        do {
            tp6Var = this.c;
            value = tp6Var.getValue();
            m1 = gt0.m1((List) value);
            int size = m1.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    Object obj = m1.get(i3);
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
                m1.remove(i2);
            }
            InputDevice device = InputDevice.getDevice(i);
            if (device != null && a(device)) {
                m1.add(device);
            }
        } while (!tp6Var.j(value, m1));
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int i) {
        tp6 tp6Var;
        Object value;
        List list;
        do {
            tp6Var = this.c;
            value = tp6Var.getValue();
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
        } while (!tp6Var.j(value, list));
    }
}
