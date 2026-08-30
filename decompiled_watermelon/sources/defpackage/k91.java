package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.o;
import androidx.fragment.app.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k91  reason: default package */
/* loaded from: classes.dex */
public final class k91 implements a90, e90, t11, oj2, xo1, cb6, yx2, p23 {
    public Object A;
    public Object B;

    public k91(int i) {
        switch (i) {
            case 17:
                this.A = new ArrayList();
                this.B = new ArrayList();
                return;
            case 22:
                this.A = new SparseIntArray();
                this.B = new SparseIntArray();
                return;
            case 23:
                this.A = new Object();
                this.B = new ArrayList();
                return;
            default:
                this.A = new s77();
                this.B = new s77();
                return;
        }
    }

    public static int F(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        if (i3 + 1 > i2) {
            return i4 + 1;
        }
        return i4;
    }

    public void A(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.A(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public void B(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.B(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public void C(o oVar, View view, boolean z) {
        oVar.getClass();
        view.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.C(oVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public void D(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.D(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public tv3 E() {
        return (tv3) ((tj4) this.B).getValue();
    }

    public void G() {
        ((SparseIntArray) this.A).clear();
    }

    public void H() {
        String str = (String) this.A;
        if (((FileChannel) this.B) == null) {
            try {
                File file = new File(str);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                this.B = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (Throwable th) {
                FileChannel fileChannel = (FileChannel) this.B;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.B = null;
                throw new IllegalStateException(wh1.A("Unable to lock file: '", str, "'."), th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [kc5] */
    public void I(String str, Class cls, mi2 mi2Var) {
        List kc5Var;
        qo2 qo2Var = (qo2) this.B;
        Context context = (Context) this.A;
        File file = new File(context.getFilesDir(), str);
        boolean isFile = file.isFile();
        List<Object> list = pp1.A;
        if (isFile) {
            int i = 0;
            Type[] typeArr = {cls};
            TypeVariable[] typeParameters = List.class.getTypeParameters();
            int length = typeParameters.length;
            if (1 == length) {
                if (!Modifier.isStatic(List.class.getModifiers()) && List.class.getDeclaringClass() != null) {
                    c44.g(List.class.getName(), " is not supported because it requires specifying an owner type", "Raw type ");
                    return;
                }
                int i2 = 0;
                while (i2 < length) {
                    Type type = typeArr[i2];
                    Objects.requireNonNull(type, "Type argument must not be null");
                    Class<?> S = l07.S(type);
                    TypeVariable typeVariable = typeParameters[i2];
                    Type[] bounds = typeVariable.getBounds();
                    int length2 = bounds.length;
                    while (i < length2) {
                        int i3 = i2;
                        if (l07.S(bounds[i]).isAssignableFrom(S)) {
                            i++;
                            i2 = i3;
                        } else {
                            throw new IllegalArgumentException("Type argument " + type + " does not satisfy bounds for type variable " + typeVariable + " declared by " + List.class);
                        }
                    }
                    i2++;
                    i = 0;
                }
                try {
                    kc5Var = (List) qo2Var.b(new FileReader(file), new n07(new to2((Type) null, List.class, typeArr)).b);
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                if (nc5.a(kc5Var) == null) {
                    list = kc5Var;
                }
                list = list;
            } else {
                throw new IllegalArgumentException(List.class.getName() + " requires " + length + " type arguments, but got 1");
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Object n = mi2Var.n(obj);
            if (n != null) {
                arrayList.add(n);
            }
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(context.getFilesDir(), str)));
        try {
            outputStreamWriter.write(qo2Var.f(arrayList));
            outputStreamWriter.close();
        } finally {
        }
    }

    public void J() {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2;
        ImageView imageView = ((b) this.A).L.f;
        BackgroundMode backgroundMode = ((bs5) this.B).b;
        backgroundMode.getClass();
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
        float f = intrinsicWidth / intrinsicHeight;
        float width = ((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight()) / ((imageView.getHeight() - imageView.getPaddingStart()) - imageView.getPaddingLeft());
        switch (ia7.a[backgroundMode.ordinal()]) {
            case 1:
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                return;
            case 2:
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return;
            case 3:
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                if (width > f) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    return;
                } else {
                    imageView.setScaleType(ImageView.ScaleType.FIT_START);
                    return;
                }
            case 4:
                if (width > f) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    return;
                } else {
                    imageView.setScaleType(ImageView.ScaleType.FIT_END);
                    return;
                }
            case 5:
                if (width > f) {
                    Context context = imageView.getContext();
                    context.getClass();
                    if (context.getResources().getConfiguration().getLayoutDirection() == 0) {
                        scaleType = ImageView.ScaleType.FIT_START;
                    } else {
                        scaleType = ImageView.ScaleType.FIT_END;
                    }
                    imageView.setScaleType(scaleType);
                    return;
                }
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return;
            case ig7.b /* 6 */:
                if (width > f) {
                    Context context2 = imageView.getContext();
                    context2.getClass();
                    if (context2.getResources().getConfiguration().getLayoutDirection() == 0) {
                        scaleType2 = ImageView.ScaleType.FIT_END;
                    } else {
                        scaleType2 = ImageView.ScaleType.FIT_START;
                    }
                    imageView.setScaleType(scaleType2);
                    return;
                }
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return;
            default:
                i.c();
                return;
        }
    }

    public qz1 K() {
        File file = (File) this.A;
        if (!file.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            return new qz1(fileOutputStream.getFD(), ((kg6) this.B).b(fileOutputStream, file.getName().getBytes(StandardCharsets.UTF_8)));
        }
        f81.y(file.getName(), "output file already exists, please use a new file: ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(java.util.ArrayList r17, defpackage.k11 r18) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k91.L(java.util.ArrayList, k11):java.lang.Object");
    }

    @Override // defpackage.xo1
    public Object a() {
        return (y27) this.A;
    }

    @Override // defpackage.e90
    public void b(y80 y80Var, Throwable th) {
        ((l91) this.B).A.execute(new u(this, (e90) this.A, th));
    }

    @Override // defpackage.a90
    public Type c() {
        return (Type) this.A;
    }

    @Override // defpackage.a90
    public Object d(xb4 xb4Var) {
        Executor executor = (Executor) this.B;
        if (executor == null) {
            return xb4Var;
        }
        return new l91(executor, xb4Var);
    }

    @Override // defpackage.yx2
    public void e() {
        synchronized (this.A) {
            try {
                ArrayList arrayList = (ArrayList) this.B;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zx2 zx2Var = (zx2) obj;
                    zx2Var.c.p(zx2Var.a, null);
                    zx2Var.b.a();
                }
                ((ArrayList) this.B).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e90
    public void f(y80 y80Var, dc5 dc5Var) {
        ((l91) this.B).A.execute(new u(this, (e90) this.A, dc5Var, 7));
    }

    @Override // defpackage.yx2
    public void g(hc1 hc1Var) {
        synchronized (this.A) {
            ArrayList arrayList = (ArrayList) this.B;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zx2 zx2Var = (zx2) obj;
                zx2Var.getClass();
                if (b53.x(zx2Var.b, hc1Var)) {
                    hc1Var.a();
                }
            }
        }
    }

    @Override // defpackage.oj2
    public void h(Throwable th) {
        int i = ((wj6) this.A).f;
        if (i == 2 && (th instanceof CancellationException)) {
            ve2.v("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
        } else {
            ve2.d0("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(oo2.I(i)), th);
        }
    }

    @Override // defpackage.yx2
    public void i(int i, hc1 hc1Var, jd0 jd0Var) {
        hc1Var.getClass();
        synchronized (this.A) {
            ((ArrayList) this.B).add(new zx2(i, hc1Var, jd0Var));
        }
    }

    @Override // defpackage.cb6
    public sb6 j() {
        return (c22) this.B;
    }

    @Override // defpackage.t11
    public Object k(Object obj) {
        gc5 gc5Var = (gc5) obj;
        gc5Var.getClass();
        String w = gc5Var.w();
        return ((t63) ((dz4) this.B).A).a((m93) this.A, w);
    }

    @Override // defpackage.oj2
    public void l(Object obj) {
        ck6 ck6Var = (ck6) obj;
        ck6Var.getClass();
        ((dk6) ((r9) this.B).a).b(ck6Var);
    }

    @Override // defpackage.xo1
    public boolean m(CharSequence charSequence, int i, int i2, w07 w07Var) {
        Spannable spannableString;
        if ((w07Var.c & 4) > 0) {
            return true;
        }
        if (((y27) this.A) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.A = new y27(spannableString);
        }
        ((jo1) this.B).getClass();
        ((y27) this.A).setSpan(new x07(w07Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.cb6
    public g76 n() {
        return (b22) this.A;
    }

    public boolean o(long j) {
        Object obj;
        List list = (List) ((ci3) this.B).B;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (cg2.y(((tp4) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        tp4 tp4Var = (tp4) obj;
        if (tp4Var == null) {
            return false;
        }
        return tp4Var.h;
    }

    public oq6 p(List list) {
        tn1 tn1Var;
        Exception e;
        long g;
        tn1 tn1Var2;
        vr6 vr6Var = null;
        try {
            int size = list.size();
            int i = 0;
            tn1Var = null;
            while (i < size) {
                try {
                    tn1Var2 = (tn1) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    tn1Var2.a((xn1) this.B);
                    i++;
                    tn1Var = tn1Var2;
                } catch (Exception e3) {
                    e = e3;
                    tn1Var = tn1Var2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((xz1) ((xn1) this.B).Y).b());
                    sb2.append(", composition=");
                    sb2.append(((xn1) this.B).c());
                    sb2.append(", selection=");
                    xn1 xn1Var = (xn1) this.B;
                    sb2.append((Object) vr6.h(ve2.g(xn1Var.B, xn1Var.L)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    tq0.R0(list, sb, "\n", new j0(tn1Var, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            xn1 xn1Var2 = (xn1) this.B;
            xn1Var2.getClass();
            to toVar = new to(((xz1) xn1Var2.Y).toString());
            xn1 xn1Var3 = (xn1) this.B;
            long g2 = ve2.g(xn1Var3.B, xn1Var3.L);
            vr6 vr6Var2 = new vr6(g2);
            if (!vr6.g(((oq6) this.A).b)) {
                vr6Var = vr6Var2;
            }
            if (vr6Var != null) {
                g = vr6Var.a;
            } else {
                g = ve2.g(vr6.e(g2), vr6.f(g2));
            }
            oq6 oq6Var = new oq6(toVar, g, ((xn1) this.B).c());
            this.A = oq6Var;
            return oq6Var;
        } catch (Exception e4) {
            tn1Var = null;
            e = e4;
        }
    }

    public void q(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.q(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public void r(o oVar, boolean z) {
        oVar.getClass();
        u uVar = (u) this.A;
        xp xpVar = uVar.w.B;
        o oVar2 = uVar.y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.r(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public void s(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.s(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public void t(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.t(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    @Override // defpackage.p23
    public l23 toInstant() {
        throw new IllegalArgumentException(((String) this.A) + " when parsing an Instant from \"" + se.Y(64, (CharSequence) this.B) + '\"');
    }

    public void u(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.u(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public void v(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.v(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public void w(o oVar, boolean z) {
        oVar.getClass();
        u uVar = (u) this.A;
        xp xpVar = uVar.w.B;
        o oVar2 = uVar.y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.w(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public void x(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.x(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public void y(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.y(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public void z(o oVar, Bundle bundle, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.z(oVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c44.b();
        }
    }

    public /* synthetic */ k91(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    public /* synthetic */ k91(Object obj, Object obj2, boolean z) {
        this.B = obj;
        this.A = obj2;
    }

    public /* synthetic */ k91(ViewGroup viewGroup, TextView textView, TextView textView2) {
        this.A = textView;
        this.B = textView2;
    }

    public k91(Animation animation) {
        this.A = animation;
        this.B = null;
    }

    public k91(Animator animator) {
        this.A = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.B = animatorSet;
        animatorSet.play(animator);
    }

    public k91(CharSequence charSequence, String str) {
        charSequence.getClass();
        this.A = str;
        this.B = charSequence;
    }
}
