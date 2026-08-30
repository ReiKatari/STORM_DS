package eh;

import ah.h0;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import cd.q1;
import cd.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements InputManager.InputDeviceListener {

    /* renamed from: a  reason: collision with root package name */
    public h0 f4484a;

    /* renamed from: b  reason: collision with root package name */
    public final q1 f4485b = cd.q.c(null);

    /* renamed from: c  reason: collision with root package name */
    public final q1 f4486c;

    /* renamed from: d  reason: collision with root package name */
    public final y0 f4487d;

    /* renamed from: e  reason: collision with root package name */
    public final q1 f4488e;

    /* renamed from: f  reason: collision with root package name */
    public final y0 f4489f;

    public c() {
        q1 c4 = cd.q.c(zb.q.A);
        this.f4486c = c4;
        this.f4487d = new y0(c4);
        q1 c10 = cd.q.c(hh.b.f6509a);
        this.f4488e = c10;
        this.f4489f = new y0(c10);
    }

    public static boolean a(InputDevice inputDevice) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 27) {
            z10 = inputDevice.isEnabled();
        } else {
            z10 = true;
        }
        if (z10 && !inputDevice.isVirtual()) {
            if (inputDevice.supportsSource(1025) || inputDevice.supportsSource(16777232)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceAdded(int i2) {
        q1 q1Var;
        Object value;
        ArrayList q02;
        InputDevice device = InputDevice.getDevice(i2);
        if (device != null && a(device)) {
            do {
                q1Var = this.f4486c;
                value = q1Var.getValue();
                q02 = zb.l.q0((List) value);
                q02.add(device);
            } while (!q1Var.i(value, q02));
        }
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int i2) {
        q1 q1Var;
        Object value;
        ArrayList q02;
        do {
            q1Var = this.f4486c;
            value = q1Var.getValue();
            q02 = zb.l.q0((List) value);
            int size = q02.size();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    Object obj = q02.get(i11);
                    i11++;
                    InputDevice inputDevice = (InputDevice) obj;
                    inputDevice.getClass();
                    if (inputDevice.getId() == i2) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                q02.remove(i10);
            }
            InputDevice device = InputDevice.getDevice(i2);
            if (device != null && a(device)) {
                q02.add(device);
            }
        } while (!q1Var.i(value, q02));
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int i2) {
        q1 q1Var;
        Object value;
        List list;
        do {
            q1Var = this.f4486c;
            value = q1Var.getValue();
            list = (List) value;
            Iterator it = list.iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((InputDevice) it.next()).getId() == i2) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.remove(i10);
                list = arrayList;
            }
        } while (!q1Var.i(value, list));
    }
}
