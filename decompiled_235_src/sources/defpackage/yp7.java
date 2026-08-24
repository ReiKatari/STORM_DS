package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.b;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yp7  reason: default package */
/* loaded from: classes.dex */
public final class yp7 {
    public int a;
    public int e;
    public final yg3 f;
    public final u11 g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r2.equals("CustomMethod") != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yp7(Context context, XmlResourceParser xmlResourceParser) {
        this.o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                this.g = z11.d(context, xmlResourceParser);
                                continue;
                            }
                            Log.e("ViewTransition", lb4.v() + " unknown tag " + name);
                            StringBuilder sb = new StringBuilder();
                            sb.append(".xml:");
                            sb.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb.toString());
                            continue;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                this.f = new yg3(context, xmlResourceParser);
                                continue;
                            }
                            Log.e("ViewTransition", lb4.v() + " unknown tag " + name);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(".xml:");
                            sb2.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb2.toString());
                            continue;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                d(context, xmlResourceParser);
                                continue;
                            }
                            Log.e("ViewTransition", lb4.v() + " unknown tag " + name);
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append(".xml:");
                            sb22.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb22.toString());
                            continue;
                        case 366511058:
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                j11.d(context, xmlResourceParser, this.g.g);
                                continue;
                            }
                            Log.e("ViewTransition", lb4.v() + " unknown tag " + name);
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append(".xml:");
                            sb222.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb222.toString());
                            continue;
                        default:
                            Log.e("ViewTransition", lb4.v() + " unknown tag " + name);
                            StringBuilder sb2222 = new StringBuilder();
                            sb2222.append(".xml:");
                            sb2222.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb2222.toString());
                            continue;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ViewTransition", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ViewTransition", "Error parsing XML resource", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [yg3, java.lang.Object] */
    public final void a(pa paVar, MotionLayout motionLayout, int i, z11 z11Var, View... viewArr) {
        z11 b;
        float alpha;
        Interpolator loadInterpolator;
        Interpolator interpolator;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        yg3 yg3Var = this.f;
        int i3 = 0;
        if (i2 == 2) {
            View view = viewArr[0];
            m74 m74Var = new m74(view);
            y74 y74Var = m74Var.f;
            float f = RecyclerView.B1;
            y74Var.L = RecyclerView.B1;
            y74Var.R = RecyclerView.B1;
            m74Var.H = true;
            y74Var.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            m74Var.g.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            k74 k74Var = m74Var.h;
            k74Var.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            k74Var.L = view.getVisibility();
            if (view.getVisibility() != 0) {
                alpha = 0.0f;
            } else {
                alpha = view.getAlpha();
            }
            k74Var.X = alpha;
            k74Var.Y = view.getElevation();
            k74Var.Z = view.getRotation();
            k74Var.d0 = view.getRotationX();
            k74Var.A = view.getRotationY();
            k74Var.e0 = view.getScaleX();
            k74Var.f0 = view.getScaleY();
            k74Var.g0 = view.getPivotX();
            k74Var.h0 = view.getPivotY();
            k74Var.i0 = view.getTranslationX();
            k74Var.j0 = view.getTranslationY();
            k74Var.k0 = view.getTranslationZ();
            k74 k74Var2 = m74Var.i;
            k74Var2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            k74Var2.L = view.getVisibility();
            if (view.getVisibility() == 0) {
                f = view.getAlpha();
            }
            k74Var2.X = f;
            k74Var2.Y = view.getElevation();
            k74Var2.Z = view.getRotation();
            k74Var2.d0 = view.getRotationX();
            k74Var2.A = view.getRotationY();
            k74Var2.e0 = view.getScaleX();
            k74Var2.f0 = view.getScaleY();
            k74Var2.g0 = view.getPivotX();
            k74Var2.h0 = view.getPivotY();
            k74Var2.i0 = view.getTranslationX();
            k74Var2.j0 = view.getTranslationY();
            k74Var2.k0 = view.getTranslationZ();
            ArrayList arrayList = (ArrayList) yg3Var.a.get(-1);
            if (arrayList != null) {
                m74Var.w.addAll(arrayList);
            }
            m74Var.g(System.nanoTime(), motionLayout.getWidth(), motionLayout.getHeight());
            int i4 = this.h;
            int i5 = this.i;
            int i6 = this.b;
            Context context = motionLayout.getContext();
            int i7 = this.l;
            if (i7 != -2) {
                if (i7 != -1) {
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 != 4) {
                                    if (i7 != 5) {
                                        if (i7 != 6) {
                                            interpolator = null;
                                            new xp7(paVar, m74Var, i4, i5, i6, interpolator, this.p, this.q);
                                            return;
                                        }
                                        loadInterpolator = new AnticipateInterpolator();
                                    } else {
                                        loadInterpolator = new OvershootInterpolator();
                                    }
                                } else {
                                    loadInterpolator = new BounceInterpolator();
                                }
                            } else {
                                loadInterpolator = new DecelerateInterpolator();
                            }
                        } else {
                            loadInterpolator = new AccelerateInterpolator();
                        }
                    } else {
                        loadInterpolator = new AccelerateDecelerateInterpolator();
                    }
                } else {
                    loadInterpolator = new l74(gr1.c(this.m), 2);
                }
            } else {
                loadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
            }
            interpolator = loadInterpolator;
            new xp7(paVar, m74Var, i4, i5, i6, interpolator, this.p, this.q);
            return;
        }
        u11 u11Var = this.g;
        if (i2 == 1) {
            int[] constraintSetIds = motionLayout.getConstraintSetIds();
            int i8 = 0;
            while (i8 < constraintSetIds.length) {
                int i9 = constraintSetIds[i8];
                if (i9 != i) {
                    b bVar = motionLayout.p0;
                    if (bVar == null) {
                        b = null;
                    } else {
                        b = bVar.b(i9);
                    }
                    int length = viewArr.length;
                    for (int i10 = i3; i10 < length; i10++) {
                        u11 i11 = b.i(viewArr[i10].getId());
                        if (u11Var != null) {
                            t11 t11Var = u11Var.h;
                            if (t11Var != null) {
                                t11Var.e(i11);
                            }
                            i11.g.putAll(u11Var.g);
                        }
                    }
                }
                i8++;
                i3 = 0;
            }
        }
        z11 z11Var2 = new z11();
        HashMap hashMap = z11Var2.g;
        hashMap.clear();
        for (Integer num : z11Var.g.keySet()) {
            u11 u11Var2 = (u11) z11Var.g.get(num);
            if (u11Var2 != null) {
                hashMap.put(num, u11Var2.clone());
            }
        }
        for (View view2 : viewArr) {
            u11 i12 = z11Var2.i(view2.getId());
            if (u11Var != null) {
                t11 t11Var2 = u11Var.h;
                if (t11Var2 != null) {
                    t11Var2.e(i12);
                }
                i12.g.putAll(u11Var.g);
            }
        }
        motionLayout.A(i, z11Var2);
        motionLayout.A(R.id.view_transition, z11Var);
        motionLayout.w(R.id.view_transition);
        b84 b84Var = new b84(motionLayout.p0, i);
        for (View view3 : viewArr) {
            int i13 = this.h;
            if (i13 != -1) {
                b84Var.h = Math.max(i13, 8);
            }
            b84Var.p = this.d;
            int i14 = this.l;
            String str = this.m;
            int i15 = this.n;
            b84Var.e = i14;
            b84Var.f = str;
            b84Var.g = i15;
            int id = view3.getId();
            if (yg3Var != null) {
                ArrayList arrayList2 = (ArrayList) yg3Var.a.get(-1);
                ?? obj = new Object();
                obj.a = new HashMap();
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj2 = arrayList2.get(i16);
                    i16++;
                    jg3 b2 = ((jg3) obj2).b();
                    b2.b = id;
                    obj.b(b2);
                }
                b84Var.k.add(obj);
            }
        }
        motionLayout.setTransition(b84Var);
        q64 q64Var = new q64(13, this, viewArr);
        motionLayout.p(1.0f);
        motionLayout.k1 = q64Var;
    }

    public final boolean b(View view) {
        boolean z;
        boolean z2;
        int i = this.r;
        if (i == -1 || view.getTag(i) != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.s;
        if (i2 == -1 || view.getTag(i2) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        if (this.k == null || !(view.getLayoutParams() instanceof o11) || (str = ((o11) view.getLayoutParams()).Y) == null || !str.matches(this.k)) {
            return false;
        }
        return true;
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e75.v);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 8) {
                if (MotionLayout.t1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = obtainStyledAttributes.getString(index);
                } else {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == 12) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 10) {
                this.d = obtainStyledAttributes.getInt(index, this.d);
            } else if (index == 4) {
                this.h = obtainStyledAttributes.getInt(index, this.h);
            } else if (index == 13) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            } else if (index == 14) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            } else if (index == 7) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.n = obtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    } else {
                        this.l = -1;
                    }
                } else {
                    this.l = obtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == 11) {
                this.p = obtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == 3) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == 6) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == 5) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == 2) {
                this.u = obtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == 1) {
                this.t = obtainStyledAttributes.getInteger(index, this.t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + lb4.x(this.o, this.a) + ")";
    }
}
