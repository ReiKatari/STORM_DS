package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Objects;
import me.magnum.melondualds.R;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ie6  reason: default package */
/* loaded from: classes.dex */
public final class ie6 {
    public final int a;
    public final a36 b;
    public final int[][] c;
    public final a36[] d;
    public final he6 e;
    public final he6 f;
    public final he6 g;
    public final he6 h;

    public ie6(gu2 gu2Var) {
        this.a = gu2Var.b;
        this.b = (a36) gu2Var.c;
        this.c = (int[][]) gu2Var.d;
        this.d = (a36[]) gu2Var.e;
        this.e = (he6) gu2Var.f;
        this.f = (he6) gu2Var.g;
        this.g = (he6) gu2Var.h;
        this.h = (he6) gu2Var.i;
    }

    public static void a(gu2 gu2Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = ay4.r;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        a36 a = a36.a(context, obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), new s(RecyclerView.A1)).a();
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i = 0;
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                            if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                int i3 = i + 1;
                                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i] = attributeNameResource;
                                i = i3;
                            }
                        }
                        gu2Var.a(StateSet.trimStateSet(iArr2, i), a);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static ie6 b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        AttributeSet asAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        gu2 gu2Var = new gu2(1);
        gu2Var.d();
        try {
            xml = context.getResources().getXml(resourceId);
            asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            gu2Var.d();
        }
        if (next == 2) {
            if (xml.getName().equals("selector")) {
                a(gu2Var, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            if (gu2Var.b == 0) {
                return null;
            }
            return new ie6(gu2Var);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public final a36 c() {
        a36 a36Var = this.b;
        he6 he6Var = this.h;
        he6 he6Var2 = this.g;
        he6 he6Var3 = this.f;
        he6 he6Var4 = this.e;
        if (he6Var4 == null && he6Var3 == null && he6Var2 == null && he6Var == null) {
            return a36Var;
        }
        z26 f = a36Var.f();
        if (he6Var4 != null) {
            f.e = he6Var4.b;
        }
        if (he6Var3 != null) {
            f.f = he6Var3.b;
        }
        if (he6Var2 != null) {
            f.h = he6Var2.b;
        }
        if (he6Var != null) {
            f.g = he6Var.b;
        }
        return f.a();
    }

    public final boolean d() {
        he6 he6Var;
        he6 he6Var2;
        he6 he6Var3;
        he6 he6Var4;
        if (this.a > 1 || (((he6Var = this.e) != null && he6Var.a > 1) || (((he6Var2 = this.f) != null && he6Var2.a > 1) || (((he6Var3 = this.g) != null && he6Var3.a > 1) || ((he6Var4 = this.h) != null && he6Var4.a > 1))))) {
            return true;
        }
        return false;
    }
}
