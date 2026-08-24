package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.o;
import androidx.fragment.app.u;
import com.google.android.gms.common.ConnectionResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yc1  reason: default package */
/* loaded from: classes.dex */
public final class yc1 implements f13, ib0, mb0, b51, so2, gt1, c43, x83 {
    public Object A;
    public Object B;

    public yc1(int i) {
        switch (i) {
            case 18:
                this.A = new ArrayList();
                this.B = new ArrayList();
                return;
            case 22:
                this.A = new SparseIntArray();
                this.B = new SparseIntArray();
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                this.A = new Object();
                this.B = new ArrayList();
                return;
            default:
                this.A = new rl7();
                this.B = new rl7();
                return;
        }
    }

    public static int E(int i, int i2) {
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
            u34.a();
        }
    }

    public void B(o oVar, View view, boolean z) {
        oVar.getClass();
        view.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.B(oVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            u34.a();
        }
    }

    public void C(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.C(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            u34.a();
        }
    }

    public e34 D() {
        return (e34) ((vs4) this.B).getValue();
    }

    public void F() {
        ((SparseIntArray) this.A).clear();
    }

    public void G() {
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
                throw new IllegalStateException(lb1.A("Unable to lock file: '", str, "'."), th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [em5] */
    public void H(String str, Class cls, qn2 qn2Var) {
        List em5Var;
        su2 su2Var = (su2) this.B;
        Context context = (Context) this.A;
        File file = new File(context.getFilesDir(), str);
        boolean isFile = file.isFile();
        List<Object> list = yt1.A;
        if (isFile) {
            int i = 0;
            Type[] typeArr = {cls};
            TypeVariable[] typeParameters = List.class.getTypeParameters();
            int length = typeParameters.length;
            if (1 == length) {
                if (!Modifier.isStatic(List.class.getModifiers()) && List.class.getDeclaringClass() != null) {
                    u34.h(List.class.getName(), " is not supported because it requires specifying an owner type", "Raw type ");
                    return;
                }
                int i2 = 0;
                while (i2 < length) {
                    Type type = typeArr[i2];
                    Objects.requireNonNull(type, "Type argument must not be null");
                    Class<?> J = q60.J(type);
                    TypeVariable typeVariable = typeParameters[i2];
                    Type[] bounds = typeVariable.getBounds();
                    int length2 = bounds.length;
                    while (i < length2) {
                        int i3 = i2;
                        if (q60.J(bounds[i]).isAssignableFrom(J)) {
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
                    em5Var = (List) su2Var.b(new FileReader(file), new ie7(new vu2((Type) null, List.class, typeArr)).b);
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                if (hm5.a(em5Var) == null) {
                    list = em5Var;
                }
                list = list;
            } else {
                throw new IllegalArgumentException(List.class.getName() + " requires " + length + " type arguments, but got 1");
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Object g = qn2Var.g(obj);
            if (g != null) {
                arrayList.add(g);
            }
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(context.getFilesDir(), str)));
        try {
            outputStreamWriter.write(su2Var.f(arrayList));
            outputStreamWriter.close();
        } finally {
        }
    }

    public void I() {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2;
        ImageView imageView = (ImageView) ((b) this.A).L.e;
        BackgroundMode backgroundMode = ((t26) this.B).b;
        backgroundMode.getClass();
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
        float f = intrinsicWidth / intrinsicHeight;
        float width = ((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight()) / ((imageView.getHeight() - imageView.getPaddingStart()) - imageView.getPaddingLeft());
        switch (io7.a[backgroundMode.ordinal()]) {
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
            case 6:
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
                i.d();
                return;
        }
    }

    public f42 J() {
        File file = (File) this.A;
        if (!file.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            return new f42(fileOutputStream.getFD(), ((bs6) this.B).b(fileOutputStream, file.getName().getBytes(StandardCharsets.UTF_8)));
        }
        e41.x(file.getName(), "output file already exists, please use a new file: ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object K(ArrayList arrayList, s41 s41Var) {
        v12 v12Var;
        int i;
        boolean z;
        LinkedHashMap linkedHashMap;
        Set<Number> keySet;
        int i2;
        ic5 ic5Var;
        if (s41Var instanceof v12) {
            v12Var = (v12) s41Var;
            int i3 = v12Var.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v12Var.Z = i3 - Integer.MIN_VALUE;
                Object obj = v12Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = v12Var.Z;
                boolean z2 = false;
                z = true;
                if (i == 0) {
                    if (i == 1) {
                        linkedHashMap = v12Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj2 = arrayList.get(i4);
                        i4++;
                        arrayList2.add(new Long(((b82) obj2).a));
                    }
                    int k0 = c14.k0(ht0.v0(arrayList, 10));
                    if (k0 < 16) {
                        k0 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(k0);
                    int size2 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj3 = arrayList.get(i5);
                        i5++;
                        b82 b82Var = (b82) obj3;
                        linkedHashMap2.put(new Long(b82Var.a), b82Var.b);
                    }
                    jh jhVar = ((sz1) this.A).v;
                    v12Var.R = linkedHashMap2;
                    v12Var.Z = 1;
                    jhVar.getClass();
                    obj = hv.d0(xk1.a, new y3(arrayList2, (r41) null, 2), v12Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                ec5 ec5Var = (ec5) obj;
                long j = ((nv4) this.B).a.e;
                ec5Var.getClass();
                linkedHashMap.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                z2 = (ec5Var.d && ec5Var.a == j) ? true : true;
                for (dc5 dc5Var : ec5Var.c) {
                    long j2 = dc5Var.a;
                    if (linkedHashSet5.add(Long.valueOf(j2))) {
                        bd5 bd5Var = (bd5) linkedHashMap.get(Long.valueOf(j2));
                        if (bd5Var == null) {
                            i2 = -1;
                        } else {
                            i2 = jc5.a[bd5Var.ordinal()];
                        }
                        if (i2 != -1) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    ic5Var = ic5.LEADERBOARD;
                                } else {
                                    i.d();
                                    return null;
                                }
                            } else {
                                ic5Var = ic5.ACHIEVEMENT;
                            }
                        } else {
                            ic5Var = null;
                        }
                        if (ic5Var != null && ic5Var == dc5Var.b) {
                            int i6 = jc5.b[dc5Var.c.ordinal()];
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        if (i6 == 4) {
                                            linkedHashSet3.add(Long.valueOf(j2));
                                        } else {
                                            i.d();
                                            return null;
                                        }
                                    } else {
                                        linkedHashSet4.add(Long.valueOf(j2));
                                    }
                                } else {
                                    linkedHashSet2.add(Long.valueOf(j2));
                                }
                            } else {
                                linkedHashSet.add(Long.valueOf(j2));
                            }
                        }
                    }
                    z2 = true;
                }
                LinkedHashSet K = ii2.K(ii2.K(ii2.K(linkedHashSet, linkedHashSet2), linkedHashSet3), linkedHashSet4);
                keySet = linkedHashMap.keySet();
                if ((keySet instanceof Collection) || !keySet.isEmpty()) {
                    for (Number number : keySet) {
                        if (!K.contains(Long.valueOf(number.longValue()))) {
                            break;
                        }
                    }
                }
                z = z2;
                if (!z) {
                    return new pb4();
                }
                return new pb4(linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4, false);
            }
        }
        v12Var = new v12(this, s41Var);
        Object obj4 = v12Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = v12Var.Z;
        boolean z22 = false;
        z = true;
        if (i == 0) {
        }
        ec5 ec5Var2 = (ec5) obj4;
        long j3 = ((nv4) this.B).a.e;
        ec5Var2.getClass();
        linkedHashMap.getClass();
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        LinkedHashSet linkedHashSet22 = new LinkedHashSet();
        LinkedHashSet linkedHashSet32 = new LinkedHashSet();
        LinkedHashSet linkedHashSet42 = new LinkedHashSet();
        LinkedHashSet linkedHashSet52 = new LinkedHashSet();
        if (ec5Var2.d) {
        }
        while (r2.hasNext()) {
        }
        LinkedHashSet K2 = ii2.K(ii2.K(ii2.K(linkedHashSet6, linkedHashSet22), linkedHashSet32), linkedHashSet42);
        keySet = linkedHashMap.keySet();
        if (keySet instanceof Collection) {
        }
        while (r1.hasNext()) {
        }
        z = z22;
        if (!z) {
        }
    }

    public void L(Annotation annotation) {
        if (((HashMap) this.B) == null) {
            this.B = new HashMap();
        }
        ((HashMap) this.B).put(annotation.annotationType(), annotation);
    }

    @Override // defpackage.ib0
    public Type a() {
        return (Type) this.A;
    }

    @Override // defpackage.ib0
    public Object b(vk4 vk4Var) {
        Executor executor = (Executor) this.B;
        if (executor == null) {
            return vk4Var;
        }
        return new gd1(executor, vk4Var);
    }

    @Override // defpackage.mb0
    public void c(gb0 gb0Var, vl5 vl5Var) {
        ((gd1) this.B).A.execute(new v(this, (mb0) this.A, vl5Var, 8));
    }

    @Override // defpackage.gt1
    public Object d() {
        return (tg7) this.A;
    }

    @Override // defpackage.c43
    public void e() {
        synchronized (this.A) {
            try {
                ArrayList arrayList = (ArrayList) this.B;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    d43 d43Var = (d43) obj;
                    d43Var.c.k(d43Var.a, null);
                    d43Var.b.a();
                }
                ((ArrayList) this.B).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mb0
    public void f(gb0 gb0Var, Throwable th) {
        ((gd1) this.B).A.execute(new v(this, (mb0) this.A, th));
    }

    @Override // defpackage.c43
    public void g(int i, ig1 ig1Var, sf0 sf0Var) {
        ig1Var.getClass();
        synchronized (this.A) {
            ((ArrayList) this.B).add(new d43(i, ig1Var, sf0Var));
        }
    }

    @Override // defpackage.b51
    public Object h(Object obj) {
        yl5 yl5Var = (yl5) obj;
        yl5Var.getClass();
        String r = yl5Var.r();
        return ((id3) ((s35) this.B).A).a((gg3) this.A, r);
    }

    @Override // defpackage.so2
    public void i(Throwable th) {
        int i = ((qv6) this.A).f;
        if (i == 2 && (th instanceof CancellationException)) {
            kj2.t("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
        } else {
            kj2.g0("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(mp2.H(i)), th);
        }
    }

    @Override // defpackage.f13
    public Object j(String str, String str2, String str3, s41 s41Var) {
        xe1 xe1Var = xk1.a;
        return hv.d0(de1.L, new la(this, str, str3, str2, null, 2), s41Var);
    }

    @Override // defpackage.c43
    public void k(ig1 ig1Var) {
        synchronized (this.A) {
            ArrayList arrayList = (ArrayList) this.B;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                d43 d43Var = (d43) obj;
                d43Var.getClass();
                if (nb3.k(d43Var.b, ig1Var)) {
                    ig1Var.a();
                }
            }
        }
    }

    public boolean l(long j) {
        Object obj;
        List list = (List) ((ap3) this.B).B;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (nj2.o(((xy4) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        xy4 xy4Var = (xy4) obj;
        if (xy4Var == null) {
            return false;
        }
        return xy4Var.h;
    }

    @Override // defpackage.gt1
    public boolean m(CharSequence charSequence, int i, int i2, re7 re7Var) {
        Spannable spannableString;
        if ((re7Var.c & 4) > 0) {
            return true;
        }
        if (((tg7) this.A) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.A = new tg7(spannableString);
        }
        ((x31) this.B).getClass();
        ((tg7) this.A).setSpan(new se7(re7Var), i, i2, 33);
        return true;
    }

    public c37 n(List list) {
        ds1 ds1Var;
        Exception e;
        long f;
        ds1 ds1Var2;
        k47 k47Var = null;
        try {
            int size = list.size();
            int i = 0;
            ds1Var = null;
            while (i < size) {
                try {
                    ds1Var2 = (ds1) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    ds1Var2.a((gs1) this.B);
                    i++;
                    ds1Var = ds1Var2;
                } catch (Exception e3) {
                    e = e3;
                    ds1Var = ds1Var2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((m42) ((gs1) this.B).Y).b());
                    sb2.append(", composition=");
                    sb2.append(((gs1) this.B).c());
                    sb2.append(", selection=");
                    gs1 gs1Var = (gs1) this.B;
                    sb2.append((Object) k47.h(jx2.f(gs1Var.B, gs1Var.L)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    gt0.O0(list, sb, "\n", new k0(ds1Var, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            gs1 gs1Var2 = (gs1) this.B;
            gs1Var2.getClass();
            fp fpVar = new fp(((m42) gs1Var2.Y).toString());
            gs1 gs1Var3 = (gs1) this.B;
            long f2 = jx2.f(gs1Var3.B, gs1Var3.L);
            k47 k47Var2 = new k47(f2);
            if (!k47.g(((c37) this.A).b)) {
                k47Var = k47Var2;
            }
            if (k47Var != null) {
                f = k47Var.a;
            } else {
                f = jx2.f(k47.e(f2), k47.f(f2));
            }
            c37 c37Var = new c37(fpVar, f, ((gs1) this.B).c());
            this.A = c37Var;
            return c37Var;
        } catch (Exception e4) {
            ds1Var = null;
            e = e4;
        }
    }

    public na2 o() {
        Map unmodifiableMap;
        String str = (String) this.A;
        if (((HashMap) this.B) == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap((HashMap) this.B));
        }
        return new na2(str, unmodifiableMap);
    }

    @Override // defpackage.so2, com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        wv6 wv6Var = (wv6) obj;
        wv6Var.getClass();
        ((xv6) ((s9) this.B).a).b(wv6Var);
    }

    public void p(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.p(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            u34.a();
        }
    }

    public void q(o oVar, boolean z) {
        oVar.getClass();
        u uVar = (u) this.A;
        jq jqVar = uVar.w.B;
        o oVar2 = uVar.y;
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
            u34.a();
        }
    }

    public void r(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
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
            u34.a();
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
            u34.a();
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
            u34.a();
        }
    }

    @Override // defpackage.x83
    public s83 toInstant() {
        throw new IllegalArgumentException(((String) this.A) + " when parsing an Instant from \"" + nb3.e0(64, (CharSequence) this.B) + '\"');
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
            u34.a();
        }
    }

    public void v(o oVar, boolean z) {
        oVar.getClass();
        u uVar = (u) this.A;
        jq jqVar = uVar.w.B;
        o oVar2 = uVar.y;
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
            u34.a();
        }
    }

    public void w(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
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
            u34.a();
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
            u34.a();
        }
    }

    public void y(o oVar, Bundle bundle, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.y(oVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            u34.a();
        }
    }

    public void z(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((u) this.A).y;
        if (oVar2 != null) {
            u parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.o.z(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            u34.a();
        }
    }

    public /* synthetic */ yc1(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    public /* synthetic */ yc1(Object obj, Object obj2, boolean z) {
        this.B = obj;
        this.A = obj2;
    }

    public /* synthetic */ yc1(Object obj) {
        this.B = null;
        this.A = obj;
    }

    public yc1(Animator animator) {
        this.A = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.B = animatorSet;
        animatorSet.play(animator);
    }

    public yc1(CharSequence charSequence, String str) {
        charSequence.getClass();
        this.A = str;
        this.B = charSequence;
    }
}
