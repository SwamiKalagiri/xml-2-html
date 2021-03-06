<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">
    <xsl:template match="/">
        <html>
            <head><title>xml2html</title></head>
            <body>
                <table border="1">
                    <tr>
                        <th>id</th>
                        <th>name</th>
                    </tr>
                    <xsl:for-each select="test/item">
                        <tr>
                            <td><xsl:value-of select="id"/></td>
                            <td><xsl:value-of select="name"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body></html>
    </xsl:template>
</xsl:stylesheet>