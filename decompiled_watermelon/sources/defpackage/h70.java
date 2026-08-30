package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h70  reason: default package */
/* loaded from: classes.dex */
public final class h70 extends n52 {
    public boolean L;
    public final ArrayList R;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final /* synthetic */ int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h70(qu2 qu2Var, boolean z, hw6 hw6Var, int i) {
        super(qu2Var, z, hw6Var);
        this.c0 = i;
        qu2Var.getClass();
        this.R = new ArrayList();
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.Z = new ArrayList();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        yz2 yz2Var;
        yz2 yz2Var2;
        yz2 yz2Var3;
        yz2 yz2Var4;
        qu2 qu2Var = this.A;
        view.getClass();
        motionEvent.getClass();
        boolean z = this.L;
        boolean z2 = true;
        ArrayList arrayList = this.R;
        if (!z) {
            final int width = view.getWidth();
            final int height = view.getHeight();
            Float valueOf = Float.valueOf(256.0f);
            float pow = (float) Math.pow((width * 256.0f) / 512.0f, 2.0d);
            aj2 aj2Var = new aj2() { // from class: k04
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    float floatValue = ((Float) obj).floatValue();
                    float floatValue2 = ((Float) obj2).floatValue();
                    ip4 ip4Var = new ip4(0, 0);
                    ip4Var.a = (int) ((width * floatValue) / 512.0f);
                    ip4Var.b = (int) ((height * floatValue2) / 512.0f);
                    return ip4Var;
                }
            };
            Float valueOf2 = Float.valueOf(548.0f);
            ip4 ip4Var = (ip4) aj2Var.j(valueOf2, valueOf);
            int i = this.c0;
            switch (i) {
                case 0:
                    yz2Var = yz2.A;
                    break;
                default:
                    yz2Var = yz2.RIGHT;
                    break;
            }
            arrayList.add(new l04(ip4Var, pow, yz2Var));
            ip4 ip4Var2 = (ip4) aj2Var.j(valueOf, valueOf2);
            switch (i) {
                case 0:
                    yz2Var2 = yz2.B;
                    break;
                default:
                    yz2Var2 = yz2.DOWN;
                    break;
            }
            arrayList.add(new l04(ip4Var2, pow, yz2Var2));
            Float valueOf3 = Float.valueOf(-36.0f);
            ip4 ip4Var3 = (ip4) aj2Var.j(valueOf, valueOf3);
            switch (i) {
                case 0:
                    yz2Var3 = yz2.X;
                    break;
                default:
                    yz2Var3 = yz2.UP;
                    break;
            }
            arrayList.add(new l04(ip4Var3, pow, yz2Var3));
            ip4 ip4Var4 = (ip4) aj2Var.j(valueOf3, valueOf);
            switch (i) {
                case 0:
                    yz2Var4 = yz2.Y;
                    break;
                default:
                    yz2Var4 = yz2.LEFT;
                    break;
            }
            arrayList.add(new l04(ip4Var4, pow, yz2Var4));
            this.L = true;
        }
        ArrayList arrayList2 = this.Y;
        arrayList2.clear();
        int action = motionEvent.getAction();
        int i2 = 0;
        if (action == 0 || action == 2) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                l04 l04Var = (l04) obj;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                ip4 ip4Var5 = l04Var.a;
                boolean z3 = z2;
                ArrayList arrayList3 = arrayList;
                if (((float) Math.pow(x - ip4Var5.a, 2.0d)) + ((float) Math.pow(y - ip4Var5.b, 2.0d)) <= l04Var.b) {
                    arrayList2.add(l04Var.c);
                }
                z2 = z3;
                arrayList = arrayList3;
            }
        }
        boolean z4 = z2;
        ArrayList arrayList4 = this.Z;
        arrayList4.clear();
        ArrayList arrayList5 = this.X;
        int size2 = arrayList5.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList5.get(i4);
            i4++;
            if (!arrayList2.contains((yz2) obj2)) {
                arrayList4.add(obj2);
            }
        }
        int size3 = arrayList4.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList4.get(i5);
            i5++;
            qu2Var.b((yz2) obj3);
        }
        if (!arrayList4.isEmpty()) {
            a(view, l52.KEY_RELEASE);
        }
        arrayList4.clear();
        int size4 = arrayList2.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = arrayList2.get(i6);
            i6++;
            if (!arrayList5.contains((yz2) obj4)) {
                arrayList4.add(obj4);
            }
        }
        int size5 = arrayList4.size();
        while (i2 < size5) {
            Object obj5 = arrayList4.get(i2);
            i2++;
            qu2Var.c((yz2) obj5);
        }
        if (!arrayList4.isEmpty()) {
            a(view, l52.KEY_PRESS);
        }
        arrayList5.clear();
        arrayList5.addAll(arrayList2);
        return z4;
    }
}
