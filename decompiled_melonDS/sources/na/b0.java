package na;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import me.magnum.melonds.R;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f10128a;

    /* renamed from: b  reason: collision with root package name */
    public final n f10129b;

    /* renamed from: c  reason: collision with root package name */
    public final int[][] f10130c;

    /* renamed from: d  reason: collision with root package name */
    public final n[] f10131d;

    /* renamed from: e  reason: collision with root package name */
    public final z f10132e;

    /* renamed from: f  reason: collision with root package name */
    public final z f10133f;

    /* renamed from: g  reason: collision with root package name */
    public final z f10134g;

    /* renamed from: h  reason: collision with root package name */
    public final z f10135h;

    public b0(a0 a0Var) {
        this.f10128a = a0Var.f10118b;
        this.f10129b = (n) a0Var.f10119c;
        this.f10130c = (int[][]) a0Var.f10120d;
        this.f10131d = (n[]) a0Var.f10121e;
        this.f10132e = (z) a0Var.f10122f;
        this.f10133f = (z) a0Var.f10123g;
        this.f10134g = (z) a0Var.f10124h;
        this.f10135h = (z) a0Var.f10125i;
    }

    public static void a(a0 a0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = t9.a.f13166r;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        n a10 = n.a(context, obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), new a(0)).a();
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i2 = 0;
                        for (int i10 = 0; i10 < attributeCount; i10++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                            if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                int i11 = i2 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i2] = attributeNameResource;
                                i2 = i11;
                            }
                        }
                        a0Var.a(StateSet.trimStateSet(iArr2, i2), a10);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static b0 b(Context context, TypedArray typedArray, int i2) {
        XmlResourceParser xml;
        AttributeSet asAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        a0 a0Var = new a0(0);
        a0Var.d();
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
            a0Var.d();
        }
        if (next == 2) {
            if (xml.getName().equals("selector")) {
                a(a0Var, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            if (a0Var.f10118b == 0) {
                return null;
            }
            return new b0(a0Var);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public final n c() {
        n nVar = this.f10129b;
        z zVar = this.f10135h;
        z zVar2 = this.f10134g;
        z zVar3 = this.f10133f;
        z zVar4 = this.f10132e;
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            return nVar;
        }
        m f8 = nVar.f();
        if (zVar4 != null) {
            f8.f10190e = zVar4.f10249b;
        }
        if (zVar3 != null) {
            f8.f10191f = zVar3.f10249b;
        }
        if (zVar2 != null) {
            f8.f10193h = zVar2.f10249b;
        }
        if (zVar != null) {
            f8.f10192g = zVar.f10249b;
        }
        return f8.a();
    }

    public final boolean d() {
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        if (this.f10128a > 1 || (((zVar = this.f10132e) != null && zVar.f10248a > 1) || (((zVar2 = this.f10133f) != null && zVar2.f10248a > 1) || (((zVar3 = this.f10134g) != null && zVar3.f10248a > 1) || ((zVar4 = this.f10135h) != null && zVar4.f10248a > 1))))) {
            return true;
        }
        return false;
    }
}
