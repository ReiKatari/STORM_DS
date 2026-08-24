#version 450

layout(constant_id = 0) const uint WRITE_FRAG_DEPTH = 0u;
layout(constant_id = 1) const uint EDGE_MARK_PASS = 0u;

layout(location = 2) noperspective in float fDepthLinear;
layout(location = 3) smooth in float fDepthPerspective;
layout(location = 1) out vec4 oAttr;

void main()
{
    if (EDGE_MARK_PASS != 0u)
        oAttr = vec4(0.0, 1.0, 0.0, 1.0);

    float depth = WRITE_FRAG_DEPTH != 0u ? fDepthPerspective : fDepthLinear;

    if (WRITE_FRAG_DEPTH != 0u)
        gl_FragDepth = depth;
}
