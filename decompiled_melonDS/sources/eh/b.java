package eh;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import oe.a0;
import oe.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends h {
    public boolean L;
    public final ArrayList R;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f4483b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, boolean z10, ce.c cVar, int i2) {
        super(kVar, z10, cVar);
        this.f4483b0 = i2;
        kVar.getClass();
        this.R = new ArrayList();
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.Z = new ArrayList();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        s sVar;
        s sVar2;
        s sVar3;
        s sVar4;
        k kVar = this.A;
        view.getClass();
        motionEvent.getClass();
        boolean z10 = this.L;
        boolean z11 = true;
        ArrayList arrayList = this.R;
        if (!z10) {
            final int width = view.getWidth();
            final int height = view.getHeight();
            Float valueOf = Float.valueOf(256.0f);
            float pow = (float) Math.pow((width * 256.0f) / 512.0f, 2);
            mc.p pVar = new mc.p() { // from class: eh.o
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    float floatValue = ((Float) obj).floatValue();
                    float floatValue2 = ((Float) obj2).floatValue();
                    a0 a0Var = new a0(0, 0);
                    a0Var.f10908a = (int) ((width * floatValue) / 512.0f);
                    a0Var.f10909b = (int) ((height * floatValue2) / 512.0f);
                    return a0Var;
                }
            };
            Float valueOf2 = Float.valueOf(548.0f);
            a0 a0Var = (a0) pVar.j(valueOf2, valueOf);
            switch (this.f4483b0) {
                case 0:
                    sVar = s.A;
                    break;
                default:
                    sVar = s.RIGHT;
                    break;
            }
            arrayList.add(new p(a0Var, pow, sVar));
            a0 a0Var2 = (a0) pVar.j(valueOf, valueOf2);
            switch (this.f4483b0) {
                case 0:
                    sVar2 = s.B;
                    break;
                default:
                    sVar2 = s.DOWN;
                    break;
            }
            arrayList.add(new p(a0Var2, pow, sVar2));
            Float valueOf3 = Float.valueOf(-36.0f);
            a0 a0Var3 = (a0) pVar.j(valueOf, valueOf3);
            switch (this.f4483b0) {
                case 0:
                    sVar3 = s.X;
                    break;
                default:
                    sVar3 = s.UP;
                    break;
            }
            arrayList.add(new p(a0Var3, pow, sVar3));
            a0 a0Var4 = (a0) pVar.j(valueOf3, valueOf);
            switch (this.f4483b0) {
                case 0:
                    sVar4 = s.Y;
                    break;
                default:
                    sVar4 = s.LEFT;
                    break;
            }
            arrayList.add(new p(a0Var4, pow, sVar4));
            this.L = true;
        }
        ArrayList arrayList2 = this.Y;
        arrayList2.clear();
        int action = motionEvent.getAction();
        int i2 = 0;
        if (action == 0 || action == 2) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p pVar2 = (p) obj;
                float x9 = motionEvent.getX();
                float y10 = motionEvent.getY();
                a0 a0Var5 = pVar2.f4498a;
                double d4 = x9 - a0Var5.f10908a;
                boolean z12 = z11;
                ArrayList arrayList3 = arrayList;
                double d10 = 2;
                if (((float) Math.pow(d4, d10)) + ((float) Math.pow(y10 - a0Var5.f10909b, d10)) <= pVar2.f4499b) {
                    arrayList2.add(pVar2.f4500c);
                }
                z11 = z12;
                arrayList = arrayList3;
            }
        }
        boolean z13 = z11;
        ArrayList arrayList4 = this.Z;
        arrayList4.clear();
        ArrayList arrayList5 = this.X;
        int size2 = arrayList5.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList5.get(i11);
            i11++;
            if (!arrayList2.contains((s) obj2)) {
                arrayList4.add(obj2);
            }
        }
        int size3 = arrayList4.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList4.get(i12);
            i12++;
            kVar.d((s) obj3);
        }
        if (!arrayList4.isEmpty()) {
            a(view, f.KEY_RELEASE);
        }
        arrayList4.clear();
        int size4 = arrayList2.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj4 = arrayList2.get(i13);
            i13++;
            if (!arrayList5.contains((s) obj4)) {
                arrayList4.add(obj4);
            }
        }
        int size5 = arrayList4.size();
        while (i2 < size5) {
            Object obj5 = arrayList4.get(i2);
            i2++;
            kVar.e((s) obj5);
        }
        if (!arrayList4.isEmpty()) {
            a(view, f.KEY_PRESS);
        }
        arrayList5.clear();
        arrayList5.addAll(arrayList2);
        return z13;
    }
}
